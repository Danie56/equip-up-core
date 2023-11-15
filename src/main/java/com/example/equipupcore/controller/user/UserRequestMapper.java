package com.example.equipupcore.controller.user;

import com.example.equipupcore.model.User;
import com.example.equipupcore.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface UserRequestMapper extends EntityToDto<UserRequest, User> {





}
