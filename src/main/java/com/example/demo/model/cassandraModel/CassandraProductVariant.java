package com.example.demo.model.cassandraModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.persistence.Entity;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table("product_variant")
public class CassandraProductVariant {
@Column("sku_code")
    private String skuCode;

@Column("business_name")
private String businessName;

}
