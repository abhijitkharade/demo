package com.example.demo.repository.cassandraRepository;

import com.example.demo.model.cassandraModel.CassandraProductDetails;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CassandraProductJpaRepository extends CassandraRepository<CassandraProductDetails,String> {

    @Query(value = "select* from realestate_squareyards.product_variant")
    List<CassandraProductDetails>findByproductId(String ProductId);
}
