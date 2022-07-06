package com.example.demo.repository.mySqlRepository;

import com.example.demo.model.mySqlModel.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductVariantRepository extends JpaRepository<ProductVariant,String> {


    ProductVariant findByProductId(String productId);

    @Query(value ="select  * from product_variant pv where price>=5000000 and price <10000000 limit 50",nativeQuery = true)
    List<ProductVariant> findPrice();
    @Query(value ="select  * from product_variant pv where price>=5000000 and price <10000000 limit 1",nativeQuery = true)
    List<ProductVariant> findPriceName();

    ProductVariant findBySkuCode(String skuCode);


//    @Query(value="select* from product_details where product_id=:pid",nativeQuery = true)
//    ProductDetails findByProductId(@Param("pid") String pid);

}
