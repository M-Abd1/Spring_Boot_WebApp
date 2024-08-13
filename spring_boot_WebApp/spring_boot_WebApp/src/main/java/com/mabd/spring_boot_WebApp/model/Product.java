package com.mabd.spring_boot_WebApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

/*@AllArgsConstructor*/

@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;


public Product() {
    this.prodId = 0;
    this.prodName = "";
    this.price = 0;
}

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public void Product()
    {
        this.prodId = 0;
        this.prodName = "";
        this.price = 0;
    }


 public void serProdId(int prodId) {
     this.prodId = prodId;
 }

 public void setPrice(int price) {
         this.price = price;
 }

 public void setProdName(String prodName) {
     this.prodName = prodName;
 }

    public int getProdId() {
        return prodId;
    }

    public int getPrice() {
        return price;
    }

    public String getProdName() {
        return prodName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}


