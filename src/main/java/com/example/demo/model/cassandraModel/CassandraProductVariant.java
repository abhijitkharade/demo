package com.example.demo.model.cassandraModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("product_variant")
public class CassandraProductVariant {
    @PrimaryKey("sku_code")
//    @Column("sku_code")
    private String skuCode;
    @Column("business_name")
    private String businessName;

    @Column("business_type")
    private String businessType;

    @Column("group_id")
    private String groupId;

    @Column("min_quantity")
    private Integer minQuantity;

    @Column("payload_product")
    private String payloadProduct;

    @Column("price")
    private Double price;

    @Column("product_id")
    private String productId;

    @Column("variant_id")
    private String variantId;


}
