package com.example.kursovaya.repository;

import com.example.kursovaya.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
