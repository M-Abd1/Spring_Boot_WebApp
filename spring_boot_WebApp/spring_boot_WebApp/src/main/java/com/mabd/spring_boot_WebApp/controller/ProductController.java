package com.mabd.spring_boot_WebApp.controller;

import com.mabd.spring_boot_WebApp.model.Product;
import com.mabd.spring_boot_WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();

    }

   // 2 ways to write the below code
    // 1. @RequestMapping(value = "/products/{prodId}", method = RequestMethod.GET)
    // 2. @GetMapping("/products/{prodId}")
    // Both are same
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
            return service.getProductById(prodId);
    }

    @PostMapping("/products/add")
    public void addProduct(@RequestBody Product product) {
        //System.out.println(product);
        service.addProduct(product);
    }


    @PutMapping("/products/update")
       public void updateProduct(@RequestBody Product product) {
            service.updateProduct(product);
        }

    @DeleteMapping("/products/delete/{prodId}")
    public void deleteProduct(@PathVariable int prodId) {
        service.deleteProduct(prodId);
    }
    //A comnent

}
