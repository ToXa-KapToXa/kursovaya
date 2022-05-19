package com.example.kursovaya.service;

import com.example.kursovaya.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAll();
    void addToUserBucket(Long productId, String username);
    void deleteToUserBucket(Long productId, String username);
}
