package com.example.demo.repository.cassandra_repository;

import com.example.demo.model.cassandraModel.CassandraProductVariant;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CassandraProductVariantRepository extends CassandraRepository<CassandraProductVariant,String> {
    @Override
    Optional<CassandraProductVariant> findById(String s);
}
