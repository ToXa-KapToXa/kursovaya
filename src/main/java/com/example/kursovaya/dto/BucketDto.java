package com.example.kursovaya.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BucketDto {
    private long amountProducts;
    private int sum;
    private List<BucketDetailDto> bucketDetails = new ArrayList<>();

    public void aggregate(){
        this.amountProducts = bucketDetails.size();
        this.sum = bucketDetails.stream()
                .map(BucketDetailDto::getSum)
                .mapToInt(BigDecimal::intValue)
                .sum();
    }
}
