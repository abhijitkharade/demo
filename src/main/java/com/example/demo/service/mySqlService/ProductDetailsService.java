package com.example.demo.service.mySqlService;

import com.example.demo.repository.mySqlRepository.ProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsService {
    @Autowired
    private ProductJpaRepository productJpaRepository;

}
