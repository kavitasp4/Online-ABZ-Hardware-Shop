package com.kp.sb.hwshopwebapp.service;

import java.util.ArrayList;
import java.util.List;

import com.kp.sb.hwshopwebapp.models.Product;
import com.kp.sb.hwshopwebapp.data.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
