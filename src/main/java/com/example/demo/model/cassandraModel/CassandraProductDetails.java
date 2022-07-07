package com.example.demo.model.cassandraModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("product_details")
public class CassandraProductDetails {
    @PrimaryKey
    @org.springframework.data.cassandra.core.mapping.Column("product_id")
    private String productId;
    @org.springframework.data.cassandra.core.mapping.Column("attributes")
    private String attributes;
    @org.springframework.data.cassandra.core.mapping.Column("brand_name")
    private String BrandName;
    @org.springframework.data.cassandra.core.mapping.Column("description")
    private String description;
    @org.springframework.data.cassandra.core.mapping.Column("group_id ")
    private String GroupId;
    @org.springframework.data.cassandra.core.mapping.Column("Product_name")
    private String productName;
    @org.springframework.data.cassandra.core.mapping.Column("Product_type")
    private String productType;
    @org.springframework.data.cassandra.core.mapping.Column("product_url")
    private String productUrl;
    @org.springframework.data.cassandra.core.mapping.Column("status")
    private String status;
    @org.springframework.data.cassandra.core.mapping.Column("city_id")
    private String cityId;
    @org.springframework.data.cassandra.core.mapping.Column("sub_location_id")
    private int subLocationId;
}
