package com.mabd.spring_boot_WebApp.repository;

import com.mabd.spring_boot_WebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo  extends JpaRepository<Product,Integer> {


}
