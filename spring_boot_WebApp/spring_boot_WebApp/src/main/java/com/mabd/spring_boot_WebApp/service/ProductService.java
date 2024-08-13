package com.mabd.spring_boot_WebApp.service;

import com.mabd.spring_boot_WebApp.model.Product;
import com.mabd.spring_boot_WebApp.repository.ProductRepo;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {



    // 2 ways to write the beloe mentioned methods
    @Autowired
    private ProductRepo repo;

  /*  List<Product> products = new ArrayList<>(Arrays.asList
            (new Product(101, "Iphone", 5000),
                    new Product(102, "Samsung", 4500),
                    new Product(103, "Pixel", 6900)));
*/

    public List<Product> getProducts() {
        //return products;
       return  repo.findAll();
    }

    public Product getProductById(int prodId) {

        /*return products.stream() //Creates a Stream instance to get list of products
                    .filter(p -> p.getProdId() == prodId)  // filters the product by id
                .findFirst().orElse(new Product(100, "No Item Found", 0));  // fetches that product*/

        return repo.findById(prodId)
                .orElseGet(() -> new Product(100, "No Item Found", 0));
    }

    public void addProduct(Product product) {
        repo.save(product);
        //products.add(product);
    }

    public void updateProduct(Product product) {
        /*for (int index = 0; index < products.size(); index++) {
            Product prod = products.get(index);
            if (prod.getProdId() == product.getProdId()) {
                products.set(index, product);
                return;
        */
        repo.save(product);

    }



    public void deleteProduct(int prodId) {
        /*int index;
        for (index = 0; index < products.size(); index++) {
            Product prod = products.get(index);
            if (prod.getProdId() == prodId) {
                products.remove(index);
            }
           //products.removeIf(p -> p.getProdId() == prodId);

        }*/

        repo.deleteById(prodId);
    }
}
