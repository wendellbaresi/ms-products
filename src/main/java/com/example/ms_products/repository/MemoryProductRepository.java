package com.example.ms_products.repository;

import com.example.ms_products.model.Product;
import com.example.ms_products.service.ProductCreationService;
import com.example.ms_products.service.ProductRetrievalService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemoryProductRepository implements ProductRepository, ProductCreationService , ProductRetrievalService {

    private List<Product> products;

    @Override
    public Product save(Product product) {
        boolean add = products.add(product);
        if (add){
            products.add(product);
        }
        return null;
    }

    @Override
    public int delete(String id) {
        int idInt = Integer.parseInt(id);
        boolean removeIf =  this.products.removeIf(product -> product.getId() == idInt);
        return removeIf ? 1 : 0;
    }

    @Override
    public List<Product> findById(String id) {
        int idInt = Integer.parseInt(id);
        return this.products.stream().filter(product -> product.getId() == idInt).toList();
    }

    public List<Product> findAll(){
        return this.products;
    }
}
