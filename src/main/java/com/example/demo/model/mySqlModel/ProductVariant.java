package com.example.demo.model.mySqlModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashMap;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_variant")
public class ProductVariant {
    @Id
    @Column(name = "sku_code")
    private String skuCode;
    @Column(name = "business_name")
    private String businessName;
    @Column (name = "business_type")
    private String  businessType;
    @Column(name = "group_id")
    private String groupId;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "min_quantity")
    private Integer minQuantity;
    @Column(name ="payload_product_name")
    private String payloadProductName;
    @Column (name = "price")
    private Double price;
    @Column (name = "product_id")
    private String productId;
    @Column(name = "status")
    private String status;
    @Column(name = "stock_availability")
    private Integer stockAvailability;
    @Column(name="variant")
    private String variant;

    public Map<String,Object> getVariant() {
        try {
            return new JSONObject(variant).toMap();

        } catch (Exception e) {
            System.out.println("inside catch");
            e.printStackTrace();
            return new HashMap<>();
        }
    }
}
