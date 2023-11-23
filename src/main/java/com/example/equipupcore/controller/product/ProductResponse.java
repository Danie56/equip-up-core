package com.example.equipupcore.controller.product;

import lombok.Data;

@Data
public class ProductResponse {
  private Long id;
  private String name;
  private Double price;
  private Long amount;
  private String description;

}
