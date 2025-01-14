package com.example.ms_products.service;

import com.example.ms_products.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductCreationService {

    Product save(Product product);
}
