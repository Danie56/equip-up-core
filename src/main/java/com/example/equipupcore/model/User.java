package com.example.equipupcore.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
  private Long id;
  private String userName;
  private String mail;
  private String password;
}
