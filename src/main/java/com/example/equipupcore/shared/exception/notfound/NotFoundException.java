package com.example.equipupcore.shared.exception.notfound;

import com.example.equipupcore.shared.exception.BaseException;
import com.example.equipupcore.shared.exception.ExceptionCode;
import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException {

  protected NotFoundException(String message) {
    super(HttpStatus.NOT_FOUND, message, ExceptionCode.NOT_FOUND);
  }
}
