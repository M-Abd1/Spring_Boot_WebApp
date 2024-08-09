package com.mabd.spring_boot_WebApp.service;

import com.mabd.spring_boot_WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    List<Product> products = Arrays.asList(new Product(101,"Iphone",5000),
            new Product(102,"Samsung",4500),
            new Product(103,"One Plus",3000));
    public List<Product> getProducts() {
        return products;
    }
}
