package com.ProductAssessment2.productDemo.controller;

import com.ProductAssessment2.productDemo.model.Product;
import com.ProductAssessment2.productDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;


    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

//    @RequestMapping("/brend")
//    public productService  getByBrand(){
//        productService.findByBrand(getByBrand());
//        return productService;
//
//    }
}
