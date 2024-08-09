package com.mabd.spring_boot_WebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;


/*@AllArgsConstructor*/
public class Product {

    private int prodId;
    private String prodName;
    private int price;



    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    {
        this.prodId = 0;
        this.prodName = "";
        this.price = 0;
    }

    public void Product (int prodId, String prodName, int price)
    {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public void serProdId(int prodId)
    {
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
}
