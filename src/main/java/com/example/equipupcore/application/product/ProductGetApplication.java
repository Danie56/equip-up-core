package com.example.equipupcore.application.product;

import com.example.equipupcore.application.image.ImageGetApplication;
import com.example.equipupcore.model.Image;
import com.example.equipupcore.model.Product;
import com.example.equipupcore.model.ProductData;
import com.example.equipupcore.service.ProductGetService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductGetApplication {
  private final ProductGetService productGetService;
  private final ImageGetApplication imageGetApplication;
    public List<ProductData> productDataGetAll(){

      return buildProductData(productGetService.productGetAll());
    }
    private List<ProductData> buildProductData(List<Product> products){
      return products.stream().map(product -> {
        Image image = imageGetApplication.imageGetByIdProduct(product.getId());
        return new ProductData(product,image);
      }).collect(Collectors.toList());
    }

}
