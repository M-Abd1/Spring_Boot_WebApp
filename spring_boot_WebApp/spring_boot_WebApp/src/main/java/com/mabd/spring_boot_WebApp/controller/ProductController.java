package com.mabd.spring_boot_WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("/product")
    public String getProducts() {


        return "Product Page";
    }
}
