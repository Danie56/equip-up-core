package com.example.equipupcore.application.user;

import com.example.equipupcore.model.User;
import com.example.equipupcore.service.UserSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserSaveApplication {
  private final UserSaveService userSaveService;
  public User userSave(User user){
    return userSaveService.userSave(user);
  }

}
