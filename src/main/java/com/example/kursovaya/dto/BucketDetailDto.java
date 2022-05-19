package com.example.kursovaya.dto;

import com.example.kursovaya.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BucketDetailDto {
    private String title;
    private Long productId;
    private BigDecimal price;
    private BigDecimal amount;
    private BigDecimal sum;
    private String image_url;

    public BucketDetailDto(Product product){
        this.title = product.getTitle();
        this.productId = product.getId();
        this.price = product.getPrice();
        this.amount = new BigDecimal(1.0);
        this.sum = product.getPrice();
        this.image_url = product.getImage_url();
    }
}
