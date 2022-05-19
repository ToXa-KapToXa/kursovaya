package com.example.kursovaya.controllers;

import com.example.kursovaya.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}/bucket")
    public String addBucket(@PathVariable Long id, Principal principal){
        if(principal == null){
            return "";
        }
        productService.addToUserBucket(id, principal.getName());
        return "redirect:/bucket";
    }

    @GetMapping("/{id}/deletebucket")
    public String deleteProducts(@PathVariable Long id, Principal principal){
        productService.deleteToUserBucket(id, principal.getName());
        return "redirect:/bucket";
    }
}