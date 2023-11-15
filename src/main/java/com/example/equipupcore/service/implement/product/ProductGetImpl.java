package com.example.equipupcore.service.implement.product;

import com.example.equipupcore.model.Product;
import com.example.equipupcore.repository.product.ProductRepository;
import com.example.equipupcore.repository.product.ProductRepositoryMapper;
import com.example.equipupcore.service.ProductGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductGetImpl implements ProductGetService {
  private final ProductRepository productRepository;
  private final ProductRepositoryMapper productRepositoryMapper;
  @Override
  public List<Product> productGetAll() {
    return productRepositoryMapper.toEntity(productRepository.findAll());
  }
}
