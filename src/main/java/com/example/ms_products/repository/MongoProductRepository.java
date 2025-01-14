package com.example.ms_products.repository;

import com.example.ms_products.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoProductRepository extends MongoRepository<Product, String> {
}
