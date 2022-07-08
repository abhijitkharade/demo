package com.example.demo.repository.cassandra_repository;

import com.example.demo.model.cassandraModel.CassandraReraDetails;
import com.example.demo.model.cassandraModel.CassandraReraDetailsKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CassandraReraRepository extends CassandraRepository<CassandraReraDetails, CassandraReraDetailsKey> {


    List<CassandraReraDetails> findByKeyId(String id);

    List<CassandraReraDetails> findByKeyBuildingId(String key);

}
