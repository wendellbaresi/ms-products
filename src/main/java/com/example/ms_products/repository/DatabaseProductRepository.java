package com.example.ms_products.repository;

import com.example.ms_products.model.Product;
import com.example.ms_products.service.ProductCreationService;
import com.example.ms_products.service.ProductRetrievalService;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class DatabaseProductRepository implements ProductRepository, ProductRetrievalService, ProductCreationService {

    private MongoRepository<Product, String> mongoRepository;

    public DatabaseProductRepository(MongoRepository<Product, String> mongoRepository){
        this.mongoRepository = mongoRepository;
    }

    @Override
    public Product save(Product product) {
        return this.mongoRepository.save(product);
    }

    @Override
    public int delete(String id) {
        this.mongoRepository.deleteById(id);
        return 1;
    }

    @Override
    public List<Product> findById(String id) {
        return this.mongoRepository.findById(id).stream().toList();
    }

    @Override
    public List<Product> findAll() {
        return this.mongoRepository.findAll();
    }
}
