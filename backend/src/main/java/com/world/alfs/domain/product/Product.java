package com.world.alfs.domain.product;


import com.world.alfs.controller.product.response.GetProductListResponse;
import com.world.alfs.controller.product.response.ProductResponse;
import com.world.alfs.domain.product_img.ProductImg;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {
    @Id
    private Long id;

    @Column()
    private String name;

    @Column()
    private String title;

    @Column()
    private int price;

    @Column()
    private int sale;

    @Column()
    private String delivery;

    @Column()
    private String seller;

    @Column()
    private String pack;

    @Column()
    private String count;

    @Column()
    private String weight;

    @Column(columnDefinition = "TEXT")
    private String allergy;

    @Column()
    private String expireDate;

    @Column()
    private String information;

    @Column()
    private String buyType;

    @Column()
    private int stock;

    @Column(columnDefinition = "TEXT")
    private String content;


    @Builder
    public Product(Long id, String name, String title, int price, int sale, String delivery, String seller, String pack, String count, String weight, String allergy, String expireDate, String information, String buyType, int stock, String content) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
        this.sale = sale;
        this.delivery = delivery;
        this.seller = seller;
        this.pack = pack;
        this.count = count;
        this.weight = weight;
        this.allergy = allergy;
        this.expireDate = expireDate;
        this.information = information;
        this.buyType = buyType;
        this.stock = stock;
        this.content = content;
    }

    public ProductResponse toResponse() {
        return ProductResponse.builder()
                .id(id)
                .name(name)
                .title(title)
                .price(price)
                .sale(sale)
                .delivery(delivery)
                .seller(seller)
                .pack(pack)
                .count(count)
                .weight(weight)
                .allergy(allergy)
                .expireDate(expireDate)
                .information(information)
                .buyType(buyType)
                .stock(stock)
                .content(content)
                .build();
    }

    public GetProductListResponse toListResponse(ProductImg img) {
        return GetProductListResponse.builder()
                .id(id)
                .title(title)
                .name(name)
                .price(price)
                .sale(sale)
                .img(img.getImg_1())
                .build();
    }

//    - - - - - - - - - 비즈니스 로직 - - - - - - - - - - - - -
    public void setProduct(int price, int sale){
        this.price=price;
        this.sale=sale;
    }

}
