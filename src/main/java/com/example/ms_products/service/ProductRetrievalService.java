package com.example.ms_products.service;

import com.example.ms_products.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductRetrievalService {

    List<Product> findById(String id);
}
