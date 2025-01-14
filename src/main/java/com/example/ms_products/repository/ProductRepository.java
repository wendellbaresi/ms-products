package com.example.ms_products.repository;

import com.example.ms_products.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {

    Product save(Product product);

    int delete(String id);

    List<Product> findById(String id);

    List<Product> findAll();
}
