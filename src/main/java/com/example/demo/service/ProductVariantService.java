package com.example.demo.service;

import com.example.demo.Model.ProductVariant;
import com.example.demo.data.NamePrice;
import com.example.demo.repository.ProductJpaRepository;
import com.example.demo.repository.ProductVariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
@Service
public class ProductVariantService {
@Autowired
    private ProductVariantRepository productVariantRepository;
@Autowired
private ProductJpaRepository productJpaRepository;
    public ProductVariant variantDetailsByPid(String pId){
      return  productVariantRepository.findByProductId(pId);

    }
    public List<Object> priceDetails(){
        try {
            List<Object> list = new ArrayList<>();
            List<ProductVariant>  result =productVariantRepository.findPrice();
            result.forEach(e->{
                Map<String,Object> map = new HashMap<>();
                map.put("product_id",e.getProductId());
                map.put("price",e.getPrice());

                list.add(map);
            });
            return list;
        }catch(Exception e) {
            System.out.println("exception");
            e.printStackTrace();
            return null;
        }
    }
    public List<Object> namePriceDetails(){
        try {
            List<Object> list = new ArrayList<>();
            List<ProductVariant>  result =productVariantRepository.findPriceName();
            result.forEach(e->{
                Map<String,Object> map = new HashMap<>();
                map.put("product_id",e.getProductId());
                map.put("price",e.getPrice());


                String pid = e.getProductId();

                String name =productJpaRepository.findByProductId(pid).getProductName();
                System.out.println("ok bhava");
                map.put("name",name);
                list.add(map);
            });
            return list;
        }catch(Exception e) {
            System.out.println("nit mr ki");
            e.printStackTrace();
            return null;
        }
    }
    public List<NamePrice>namePriceObj(){
        try{
            List<NamePrice> list = new ArrayList<>();
            List<ProductVariant>  result =productVariantRepository.findPriceName();
            result.forEach(e->{
                String pId = e.getProductId();
                Double price = e.getPrice();
                String name =productJpaRepository.findByProductId(pId).getProductName();


                System.out.println("ok bhava");

                list.add(new NamePrice(pId,price,name));
            });
            return list;
        }catch (Exception e){
            System.out.println("double jay ho");
            return null;
        }
    }
    public NamePrice namePriceObj(String pId){
        try {
            ProductVariant result = productVariantRepository.findByProductId(pId);
            System.out.println(pId);
            System.out.println(result);

            double price= result.getPrice();
            System.out.println(price);
            String name=productJpaRepository.findByProductId(pId).getProductName();
            System.out.println(name);
            return new NamePrice(pId,price,name);
        } catch (Exception e) {
            System.out.println("mi nay det");
            e.printStackTrace();
            return new NamePrice(pId,0.00000,"kahich nahi sapdl");


        }
    }
}
