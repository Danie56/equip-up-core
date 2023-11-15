package com.example.equipupcore.controller.user;

import com.example.equipupcore.application.user.UserGetApplication;
import com.example.equipupcore.application.user.UserSaveApplication;
import com.example.equipupcore.model.User;
import com.example.equipupcore.service.UserSaveService;
import com.example.equipupcore.shared.mapper.EntityToDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class UserController {

  private final UserResponseMapper userResponseMapper;
  private final UserSaveApplication userSaveApplication;
  private final UserGetApplication userGetApplication;
  private final UserRequestMapper userRequestMapper;

  @PostMapping
  public ResponseEntity<UserResponse> saveUser(@RequestBody UserRequest request){
    return new ResponseEntity<>(userResponseMapper.toDto(userSaveApplication.userSave(userRequestMapper.toDto(request))),
        HttpStatus.CREATED);
  }
  @GetMapping("/get/{mail}")
  public ResponseEntity<UserResponse> saveGetByMail(@PathVariable("mail") String mail){
    return new ResponseEntity<>(userResponseMapper.toDto(userGetApplication.userGetByMail(mail)),
        HttpStatus.OK);
  }


}
