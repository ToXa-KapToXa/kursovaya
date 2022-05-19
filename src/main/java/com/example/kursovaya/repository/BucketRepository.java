package com.example.kursovaya.repository;

import com.example.kursovaya.entity.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
}
