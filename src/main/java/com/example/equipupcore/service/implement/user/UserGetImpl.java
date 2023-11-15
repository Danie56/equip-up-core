package com.example.equipupcore.service.implement.user;

import com.example.equipupcore.model.User;
import com.example.equipupcore.repository.user.UserRepository;
import com.example.equipupcore.repository.user.UserRepositoryMapper;
import com.example.equipupcore.service.UserGetService;
import com.example.equipupcore.service.UserSaveService;
import com.example.equipupcore.shared.exception.custom.UserAlreadyExistsException;
import lombok.AllArgsConstructor;
import org.mapstruct.control.MappingControl.Use;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserGetImpl implements UserGetService {
  private final UserRepository userRepository;
  private final UserRepositoryMapper userRepositoryMapper;

  @Override
  public User userGetByMail(String mail) {
    return userRepositoryMapper.toEntity(userRepository.findByMail(mail));
  }
}
