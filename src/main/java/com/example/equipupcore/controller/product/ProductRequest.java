package com.example.equipupcore.controller.product;

import com.example.equipupcore.controller.image.ImageRequest;
import lombok.Data;

@Data
public class ProductRequest {
  private String name;
  private Double price;
  private Long amount;
  private String description;
  private ImageRequest imageRequest;
}
