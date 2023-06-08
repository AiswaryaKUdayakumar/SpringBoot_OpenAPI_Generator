package com.UST.SpringbootOpenapiGenerator.repository;

import com.UST.SpringbootOpenapiGenerator.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByName(String name);
}
