package com.mabd.spring_boot_WebApp.service;

import com.mabd.spring_boot_WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList
            (new Product(101, "Iphone", 5000),
                    new Product(102, "Samsung", 4500),
                    new Product(103, "Pixel", 6900)));


    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {

        return products.stream() //Creates a Stream instance to get list of products
                .filter(p -> p.getProdId() == prodId)  // filters the product by id
                .findFirst().orElse(new Product(100, "No Item Found", 0));  // fetches that product
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        for (int index = 0; index < products.size(); index++) {
            Product prod = products.get(index);
            if (prod.getProdId() == product.getProdId()) {
                products.set(index, product);
                return;
            }
        }
    }

    public void deleteProduct(int prodId) {
        int index;
        for (index = 0; index < products.size(); index++) {
            Product prod = products.get(index);
            if (prod.getProdId() == prodId) {
                products.remove(index);
            }
           //products.removeIf(p -> p.getProdId() == prodId);

        }
    }
}
