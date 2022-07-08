package com.example.demo.service;

import com.example.demo.model.cassandraModel.CassandraReraDetails;
import com.example.demo.repository.cassandra_repository.CassandraReraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CassandraReraService {
    @Autowired
   private CassandraReraRepository cassandraReraRepository;

   /* public Optional<CassandraReraDetails> findById(String id){
        return cassandraReraRepository.findById(id);
    }*/

    public List<CassandraReraDetails> findByKeyBuildingId(String key){
        return cassandraReraRepository.findByKeyBuildingId(key);
    }


}
