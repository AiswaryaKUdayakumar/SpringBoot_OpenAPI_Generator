package com.UST.SpringbootOpenapiGenerator.controller;

import com.UST.SpringbootOpenapiGenerator.entity.Product;
import com.UST.SpringbootOpenapiGenerator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable long id){
        return service.getProductById(id);
    }



}
