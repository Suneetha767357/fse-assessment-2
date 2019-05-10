package com.ProductAssessment2.productDemo.service;

import com.ProductAssessment2.productDemo.model.Product;
import com.ProductAssessment2.productDemo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductRepo productRepo;

    @Autowired
    ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public void save(Product product) {
        productRepo.save(product);
    }

    public List<Product> findByBrand(String brand) {
        return productRepo.findByBrand(brand);

    }

    public List<Product> findByColor(String color) {
        return productRepo.findByColor(color);
    }

    public List<Product> findByPriceRange(double low, double high) {
        return productRepo.findByPriceRange(low, high);

    }
}
