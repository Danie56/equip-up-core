package com.example.equipupcore.service.implement.product;

import com.example.equipupcore.model.Product;
import com.example.equipupcore.model.User;
import com.example.equipupcore.repository.product.ProductRepository;
import com.example.equipupcore.repository.product.ProductRepositoryMapper;
import com.example.equipupcore.repository.user.UserRepository;
import com.example.equipupcore.repository.user.UserRepositoryMapper;
import com.example.equipupcore.service.ProductSaveService;
import com.example.equipupcore.service.UserSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductSaveImpl implements ProductSaveService {
  private final ProductRepository productRepository;
  private final ProductRepositoryMapper productRepositoryMapper;
  @Override
  public Product productSave(Product product) {
    return productRepositoryMapper.toEntity(productRepository.save(productRepositoryMapper.toDto(product)));
  }
}
