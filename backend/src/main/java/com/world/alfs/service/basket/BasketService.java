package com.world.alfs.service.basket;

import com.world.alfs.controller.basket.response.GetBasketResponse;
import com.world.alfs.controller.basket.response.GetPurchaseResponse;
import com.world.alfs.domain.basket.Basket;
import com.world.alfs.domain.basket.repository.BasketRepository;
import com.world.alfs.domain.member.Member;
import com.world.alfs.domain.member.repository.MemberRepository;
import com.world.alfs.domain.product.Product;
import com.world.alfs.domain.product.repository.ProductRepository;
import com.world.alfs.domain.product_img.ProductImg;
import com.world.alfs.domain.product_img.repostiory.ProductImgRepository;
import com.world.alfs.service.basket.dto.AddBasketDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
@Transactional
public class BasketService {
    private final BasketRepository basketRepository;
    private final MemberRepository memberRepository;
    private final ProductImgRepository productImgRepository;
    private final ProductRepository productRepository;

    // 장바구니 조회
    public List<GetBasketResponse> getBasket(Long member_id) throws Exception{
        Optional<Member> member = memberRepository.findById(member_id);
        if (member.isEmpty()) throw new Exception("존재하지 않는 회원입니다.");
        List<Basket> basketList = basketRepository.findByMemberAndStatus(member.get(), 0);
        List<GetBasketResponse> responseList = new ArrayList<>();
        for (Basket basket : basketList){
            ProductImg img = productImgRepository.findByProductId(basket.getProduct().getId());
            Optional<Product> product = productRepository.findById(basket.getProduct().getId());
            if (product.isEmpty()) continue;

            GetBasketResponse response = GetBasketResponse.builder()
                    .basket_id(basket.getId())
                    .count(basket.getCount())
                    .getProductListResponse(product.get().toListResponse(img))
                    .build();
            responseList.add(response);
        }
        return responseList;
    }

    // 장바구니 추가
    public GetBasketResponse addBasket(Long member_id, Long product_id, int count) throws Exception {
        Optional<Member> member = memberRepository.findById(member_id);
        Optional<Product> product = productRepository.findById(product_id);
        if (member.isEmpty()) throw new Exception("존재하지 않는 회원입니다.");
        if (product.isEmpty()) throw new Exception("존재하지 않는 상품입니다.");
        if (count < 1) throw new Exception("수량은 1개 이상이여야 합니다.");

        Optional<Basket> existedBasket = basketRepository.findByMemberAndProductAndStatus(member.get(), product.get(), 0);
        ProductImg img = productImgRepository.findByProductId(product_id);
        if (existedBasket.isEmpty()){
            AddBasketDto addBasketDto = AddBasketDto.builder()
                    .member(member.get())
                    .product(product.get())
                    .count(count)
                    .status(0)
                    .build();

            existedBasket = Optional.of(basketRepository.save(addBasketDto.toEntity()));
        }
        else {
            if (existedBasket.get().getStatus() != 0) throw new Exception("삭제 혹은 결제된 장바구니입니다.");
            changeCount(member_id, existedBasket.get().getId(), count);
        }
            return GetBasketResponse.builder()
                    .basket_id(existedBasket.get().getId())
                    .count(existedBasket.get().getCount())
                    .getProductListResponse(product.get().toListResponse(img))
                    .build();
    }

    public int changeCount(Long member_id, Long basket_id, int diff) throws Exception{
        Optional<Basket> basket = basketRepository.findById(basket_id);
        if (basket.isEmpty()) throw new Exception("존재하지 않는 장바구니입니다.");
        if (basket.get().getStatus() != 0) throw new Exception("삭제 혹은 결제된 장바구니입니다.");
        if (basket.get().getMember().getId() != member_id) throw  new Exception("권한이 없습니다.");
        if (basket.get().getCount() <= 1 && diff < 0) throw new Exception("0개로 줄일 수 없습니다.");
        basket.get().changeCount(diff);
        Basket changedBasket = basketRepository.save(basket.get());
        return basket.get().getCount();
    }

    public Long changeBasketStatus(Long member_id, Long basket_id, int status) throws Exception {
        Optional<Basket> basket = basketRepository.findById(basket_id);
        if (basket.isEmpty()) throw new Exception("존재하지 않는 장바구니입니다.");
        if (basket.get().getMember().getId() != member_id) throw new Exception("권한이 없습니다.");
        if (basket.get().getStatus() != 0) throw new Exception("삭제 혹은 결제된 장바구니입니다.");
        basket.get().setStatus(status);
        return basketRepository.save(basket.get()).getId();
    }

    public GetPurchaseResponse purchase(Long member_id, Long basket_id) throws Exception {
        Optional<Basket> basket = basketRepository.findById(basket_id);
        if (basket.isEmpty()) throw new Exception("존재하지 않는 장바구니입니다.");
        if (basket.get().getStatus() != 0) throw new Exception("삭제 혹은 결제된 장바구니입니다.");
        if (basket.get().getMember().getId() != member_id) throw new Exception("권한이 없습니다.");
        basket.get().setPurchase(basket.get().getProduct().getSale());
        basket.get().setStatus(1);
        Basket purchasedBasket = basketRepository.save(basket.get());
        Product product = purchasedBasket.getProduct();
        ProductImg img = productImgRepository.findByProductId(product.getId());
        return GetPurchaseResponse.builder()
                .basket_id(purchasedBasket.getId())
                .count(purchasedBasket.getCount())
                .totalPrice(purchasedBasket.getPurchase())
                .getProductListResponse(product.toListResponse(img))
                .build();
    }

    public List<GetPurchaseResponse> getPurchaseList(Long member_id) throws Exception {
        Optional<Member> member = memberRepository.findById(member_id);
        if (member.isEmpty()) throw new Exception("존재하지 않는 회원입니다.");
        List<Basket> purchaseList = basketRepository.findByMemberAndStatus(member.get(), 1);
        List<GetPurchaseResponse> responseList = new ArrayList<>();

        for (Basket basket : purchaseList){
            Product product = basket.getProduct();
            ProductImg img = productImgRepository.findByProductId(product.getId());
            GetPurchaseResponse response = GetPurchaseResponse.builder()
                    .basket_id(basket.getId())
                    .count(basket.getCount())
                    .totalPrice(basket.getPurchase())
                    .getProductListResponse(basket.getProduct().toListResponse(img))
                    .build();
            responseList.add(response);
        }

        return responseList;
    }
}
