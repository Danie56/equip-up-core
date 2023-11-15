package com.example.equipupcore.repository.product;

import com.example.equipupcore.model.Product;
import com.example.equipupcore.model.User;
import com.example.equipupcore.repository.user.UserDto;
import com.example.equipupcore.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface ProductRepositoryMapper extends EntityToDto<Product, ProductDto> {
}
