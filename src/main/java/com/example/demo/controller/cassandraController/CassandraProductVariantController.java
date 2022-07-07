package com.example.demo.controller.cassandraController;


import com.example.demo.data.mySqlData.ProductId;
import com.example.demo.model.cassandraModel.CassandraProductVariant;
import com.example.demo.service.cassandraService.CassandraProductVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
public class CassandraProductVariantController {

    @Autowired
    CassandraProductVariantService cassandraProductVariantService;
   @GetMapping(value = "/information/{skucode}")
 public CassandraProductVariant findById(@PathVariable String skuCode){
       return cassandraProductVariantService.findById(skuCode).get();
   }
    @GetMapping(value = "/info/{productId}")
    public List<CassandraProductVariant> findByProductId(@PathVariable String productId){
        return cassandraProductVariantService.findByProductId(productId);
    }

}
