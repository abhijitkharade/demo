package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "product_details")
public class ProductDetails {
    @Id
    @Column(name = "product_id")
    private String productId;
    @Column(name = "attributes")
    private String attributes;
    @Column(name = "brand_name")
    private String BrandName;
    @Column(name = "description")
    private String description;
    @Column(name = "group_id ")
    private String GroupId;
    @Column(name = "Product_name")
    private String productName;
    @Column(name = "Product_type")
    private String productType;
    @Column(name = "product_url")
    private String productUrl;
    @Column(name = "status")
    private String status;
    @Column(name = "city_id")
    private String cityId;
    @Column(name = "sub_location_id")
    private int subLocationId;

    public Map<String,Object> getAttributes() {
        try {
            return new JSONObject(attributes).toMap();
            //return new JSONArray(attributes).toList().stream().map(Object::toString).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("inside catch");
            e.printStackTrace();

            return new HashMap<>();
        }
    }
}



