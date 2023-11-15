package com.example.equipupcore.model;

import lombok.Data;

@Data
public class Image {
  private Long id;
  private Product product;
  private String url;
}