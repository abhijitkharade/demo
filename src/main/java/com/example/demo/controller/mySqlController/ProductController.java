
package com.example.demo.controller.mySqlController;

import com.example.demo.model.mySqlModel.ProductDetails;
import com.example.demo.repository.mySqlRepository.ProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController{
    @Autowired
    private ProductJpaRepository productJpaRepository;

    @GetMapping(value = "/all")
    public List<ProductDetails> findAll(){
        return productJpaRepository.findAll();
    }

    @GetMapping(value = "/{productId}")
    public ProductDetails findByProductId(@PathVariable String productId) {
        ProductDetails details = productJpaRepository.findByProductId(productId);

        return details;
    }

}