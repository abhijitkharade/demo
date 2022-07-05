package com.example.demo.repository.mySqlRepository;

import com.example.demo.model.mySqlModel.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<ProductDetails,String> {


  ProductDetails findByProductId(String ProductId);

}
