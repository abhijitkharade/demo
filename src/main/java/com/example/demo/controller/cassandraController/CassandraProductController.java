package com.example.demo.controller.cassandraController;

import com.example.demo.model.cassandraModel.CassandraProductDetails;
import com.example.demo.model.mySqlModel.ProductDetails;
import com.example.demo.repository.cassandraRepository.CassandraProductJpaRepository;
import com.example.demo.repository.mySqlRepository.ProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cassandraProducts")
public class CassandraProductController{
    @Autowired
    private CassandraProductJpaRepository cassandraProductJpaRepository;

    @GetMapping(value = "/{productId}")
    public List<CassandraProductDetails> indByProductId(@PathVariable String productId){
        return cassandraProductJpaRepository.findByproductId(productId);
    }

}
