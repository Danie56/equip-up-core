package com.example.equipupcore.service.implement.image;

import com.example.equipupcore.model.Image;
import com.example.equipupcore.repository.image.ImageRepository;
import com.example.equipupcore.repository.image.ImageRepositoryMapper;
import com.example.equipupcore.service.ImageGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImageGetImpl implements ImageGetService {
  private final ImageRepository imageRepository;
  private final ImageRepositoryMapper imageRepositoryMapper;
  @Override
  public Image imageGetByIdProduct(Long idProduct) {
    return imageRepositoryMapper.toEntity(imageRepository.findByProductId(idProduct));
  }
}
