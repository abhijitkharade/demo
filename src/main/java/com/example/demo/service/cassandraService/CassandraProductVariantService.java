package com.example.demo.service.cassandraService;

import com.example.demo.model.cassandraModel.CassandraProductVariant;
import com.example.demo.repository.cassandra_repository.CassandraProductVariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CassandraProductVariantService {

    @Autowired
    CassandraProductVariantRepository cassandraProductVariantRepository;

    public Optional<CassandraProductVariant> findById(String skuCode){
        return cassandraProductVariantRepository.findById(skuCode);
    }
    public List<CassandraProductVariant> findByProductId(String productId){
        return cassandraProductVariantRepository.findByProductId(productId);
    }





}
