package com.example.equipupcore.controller.product;

import com.example.equipupcore.model.Product;
import com.example.equipupcore.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface ProductResponseMapper extends EntityToDto<Product, ProductResponse> {

}
