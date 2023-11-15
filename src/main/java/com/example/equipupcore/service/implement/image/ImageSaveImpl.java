package com.example.equipupcore.service.implement.image;

import com.example.equipupcore.model.Image;
import com.example.equipupcore.model.User;
import com.example.equipupcore.repository.image.ImageRepository;
import com.example.equipupcore.repository.image.ImageRepositoryMapper;
import com.example.equipupcore.repository.user.UserRepository;
import com.example.equipupcore.repository.user.UserRepositoryMapper;
import com.example.equipupcore.service.ImageSaveService;
import com.example.equipupcore.service.UserSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImageSaveImpl implements ImageSaveService {
  private final ImageRepository imageRepository;
  private final ImageRepositoryMapper imageRepositoryMapper;

  @Override
  public Image imageSave(Image image) {
    return imageRepositoryMapper.toEntity(imageRepository.save(imageRepositoryMapper.toDto(image)));
  }
}
