package com.example.ms_products.controller;

import com.example.ms_products.model.Product;
import com.example.ms_products.repository.DatabaseProductRepository;
import com.example.ms_products.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        return ResponseEntity.ok(productRepository.save(product));
    }

    @GetMapping("{id}")
    public ResponseEntity<?> findProductById(@PathVariable String id){
        return ResponseEntity.ok(productRepository.findById(id));
    }

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(productRepository.findAll());
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody Product product){
        return ResponseEntity.ok(productRepository.save(product));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable String id){
        return ResponseEntity.ok(productRepository.delete(id));
    }


}
