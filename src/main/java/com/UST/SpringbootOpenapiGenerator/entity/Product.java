package com.UST.SpringbootOpenapiGenerator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue
     private Long id;
     private String name;
     private String prodName;
     private String prodQuan;
     private String ProdPrice;
}
