package com.world.alfs.controller.product.response;

import com.world.alfs.domain.product.Product;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class GetProductListResponse {
    private Long id;

    private String name;

    private String title;

    private int price;

    private int sale;

    private String img;


    private List<Integer> filterCode;
    @Builder
    public GetProductListResponse(Long id, String name, String title, int price, int sale, String img, List<Integer> filterCode) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.price = price;
        this.sale = sale;
        this.img = img;
        this.filterCode = filterCode;
    }

    public GetProductListResponse toGetProductListResponse(Product product){
        return GetProductListResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .title(product.getTitle())
                .price(product.getPrice())
                .sale(product.getSale())
//                .img(productImg)
                .build();
    }

    public void setCode(List<Integer> filterCode) {
        this.filterCode = filterCode;
    }
}
