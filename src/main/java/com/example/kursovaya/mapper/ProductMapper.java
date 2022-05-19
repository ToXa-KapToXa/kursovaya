package com.example.kursovaya.mapper;

import com.example.kursovaya.dto.ProductDto;
import com.example.kursovaya.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper MAPPER = Mappers.getMapper(ProductMapper.class);

    List<ProductDto> fromProductList(List<Product> products);
}

