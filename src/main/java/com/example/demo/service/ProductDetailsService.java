package com.example.demo.service;

import com.example.demo.Model.ProductVariant;
import com.example.demo.repository.ProductJpaRepository;
import com.example.demo.repository.ProductVariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsService {
    @Autowired
    private ProductJpaRepository productJpaRepository;

}
