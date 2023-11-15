package com.example.equipupcore.controller.product;

import com.example.equipupcore.application.product.ProductGetApplication;
import com.example.equipupcore.application.product.ProductSaveApplication;
import com.example.equipupcore.controller.image.ImageRequestMapper;
import com.example.equipupcore.controller.user.UserRequest;
import com.example.equipupcore.controller.user.UserResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class ProductController {
  private final ProductSaveApplication productSaveApplication;
  private final ProductGetApplication productGetApplication;
  private final ProductResponseMapper productResponseMapper;
  private final ProductRequestMapper productRequestMapper;
  private final ProductDataResponseMapper productDataResponseMapper;
  private final ImageRequestMapper imageRequestMapper;
  @PostMapping
  public ResponseEntity<ProductResponse> saveProduct(@RequestBody ProductRequest request){
    return new ResponseEntity<>(productResponseMapper.toDto(productSaveApplication.productSave(productRequestMapper.toDto(request),imageRequestMapper.toEntity(request.getImageRequest()))),
        HttpStatus.CREATED);
  }
  @GetMapping
  public ResponseEntity<List<ProductDataResponse>> getAllProduct(){
    return new ResponseEntity<>(productDataResponseMapper.toDto(productGetApplication.productDataGetAll()),HttpStatus.OK);
  }

}
