package com.example.equipupcore.application.product;

import com.example.equipupcore.application.image.ImageSaveApplication;
import com.example.equipupcore.model.Image;
import com.example.equipupcore.model.Product;
import com.example.equipupcore.service.ProductSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductSaveApplication {
  private final ProductSaveService productSaveService;
  private final ImageSaveApplication imageSaveApplication;
  public Product productSave(Product product, Image image){
    Product productSaved = productSaveService.productSave(product);
    image.setProduct(productSaved);
    imageSaveApplication.imageSave(image);
    return productSaved;
  }

}
