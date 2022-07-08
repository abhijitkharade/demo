package com.example.demo.controller.cassandraController;

import com.example.demo.model.cassandraModel.CassandraReraDetails;
import com.example.demo.service.CassandraReraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CassandraReraController {

@Autowired
    private CassandraReraService cassandraReraService;

/*@GetMapping(value="/rera/{id}")
    public Optional<CassandraReraDetails> findById(@PathVariable String id){
    return cassandraReraService.findById(id);
}*/

    @GetMapping(value="/rera/{key}")
    public List<CassandraReraDetails> findByKey(@PathVariable String key){
        return cassandraReraService.findByKeyBuildingId(key);
    }


}
