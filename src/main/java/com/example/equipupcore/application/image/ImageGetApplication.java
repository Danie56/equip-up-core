package com.example.equipupcore.application.image;

import com.example.equipupcore.model.Image;
import com.example.equipupcore.service.ImageGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImageGetApplication {
  private final ImageGetService imageGetService;
  public Image imageGetByIdProduct(Long idProduct){
    return imageGetService.imageGetByIdProduct(idProduct);
  }

}
