package com.example.equipupcore.repository.user;

import com.example.equipupcore.model.User;
import com.example.equipupcore.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.control.MappingControl.Use;

@Mapper
public interface UserRepositoryMapper extends EntityToDto<User,UserDto> {

}
