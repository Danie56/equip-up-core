package com.example.equipupcore.controller.product;

import com.example.equipupcore.controller.image.ImageResponse;
import lombok.Data;

@Data

public class ProductDataResponse {
  private ProductResponse product;
  private ImageResponse image;

}
