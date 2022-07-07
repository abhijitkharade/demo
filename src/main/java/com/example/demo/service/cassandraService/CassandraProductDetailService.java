package com.example.demo.service.cassandraService;

import com.example.demo.model.cassandraModel.CassandraProductDetails;
import com.example.demo.model.cassandraModel.CassandraProductVariant;
import com.example.demo.repository.cassandraRepository.CassandraProductJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CassandraProductDetailService {
    @Autowired
    private CassandraProductJpaRepository cassandraProductJpaRepository;

    public List<CassandraProductDetails> variantDetailsById(String Id){
        return cassandraProductJpaRepository.findByproductId(Id);
    }
}
