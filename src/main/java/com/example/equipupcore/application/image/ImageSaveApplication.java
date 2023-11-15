package com.example.equipupcore.application.image;

import com.example.equipupcore.model.Image;
import com.example.equipupcore.service.ImageSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImageSaveApplication {
  private final ImageSaveService imageSaveService;
  public Image imageSave(Image image){
    return imageSaveService.imageSave(image);
  }

}
