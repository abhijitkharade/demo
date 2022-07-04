package com.example.demo.repository;

import com.example.demo.Model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductDetails,String> {


  ProductDetails findByProductId(String ProductId);

}
