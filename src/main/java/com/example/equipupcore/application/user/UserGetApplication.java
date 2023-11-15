package com.example.equipupcore.application.user;

import com.example.equipupcore.model.User;
import com.example.equipupcore.service.UserGetService;
import com.example.equipupcore.service.UserSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserGetApplication {
  private final UserGetService userGetService;
    public User userGetByMail(String mail){

      return userGetService.userGetByMail(mail);
    }

}
