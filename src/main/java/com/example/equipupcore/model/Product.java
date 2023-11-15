package com.example.equipupcore.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Product {

  private Long id;
  private String name;
  private Double price;
  private Long amount;
  private String description;
}