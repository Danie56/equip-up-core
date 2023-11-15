package com.example.equipupcore.shared.exception.custom;

import com.example.equipupcore.shared.exception.notfound.NotFoundException;

public class UserAlreadyExistsException extends NotFoundException {

  public UserAlreadyExistsException(String mail) {
    super(String.format("User with mail: %s already exists",mail));
  }
}
