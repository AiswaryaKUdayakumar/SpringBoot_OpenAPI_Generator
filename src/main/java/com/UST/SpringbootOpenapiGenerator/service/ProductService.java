package com.UST.SpringbootOpenapiGenerator.service;

import com.UST.SpringbootOpenapiGenerator.entity.Product;
import com.UST.SpringbootOpenapiGenerator.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;



    public Product getProductById(long id) {
        return repo.findById(id).orElse(null);
    }


    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }
}
