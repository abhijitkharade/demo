package com.example.demo.data.mySqlData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NamePrice {
    @JsonProperty("product_id")
    private String productId;
    private Double price;
    private String name;
}
