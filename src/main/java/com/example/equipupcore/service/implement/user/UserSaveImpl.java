package com.example.equipupcore.service.implement.user;

import com.example.equipupcore.model.User;
import com.example.equipupcore.repository.user.UserRepository;
import com.example.equipupcore.repository.user.UserRepositoryMapper;
import com.example.equipupcore.service.UserSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserSaveImpl implements UserSaveService {
  private final UserRepository userRepository;
  private final UserRepositoryMapper userRepositoryMapper;
  @Override
  public User userSave(User user) {
    return userRepositoryMapper.toEntity(userRepository.save(userRepositoryMapper.toDto(user)));
  }
}
