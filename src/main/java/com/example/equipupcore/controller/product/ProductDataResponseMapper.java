package com.example.equipupcore.controller.product;

import com.example.equipupcore.controller.image.ImageResponseMapper;
import com.example.equipupcore.model.ProductData;
import com.example.equipupcore.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper(uses = {ProductResponseMapper.class, ImageResponseMapper.class})
public interface ProductDataResponseMapper extends EntityToDto<ProductData, ProductDataResponse> {

}
