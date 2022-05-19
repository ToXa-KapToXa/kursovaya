package com.example.kursovaya.service;

import com.example.kursovaya.dto.BucketDto;
import com.example.kursovaya.entity.Bucket;
import com.example.kursovaya.entity.User;

import java.util.List;

public interface BucketService {
    Bucket createBucket(User user, List<Long> productIds);

    void addProducts(Bucket bucket, List<Long> productIds);

    BucketDto getBucketByUser(String name);

    void deleteProducts(Bucket bucket, List<Long> productIds);
}