package com.example.equipupcore.controller.image;

import com.example.equipupcore.controller.product.ProductResponse;
import com.example.equipupcore.model.Image;
import com.example.equipupcore.model.Product;
import com.example.equipupcore.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface ImageResponseMapper extends EntityToDto<Image, ImageResponse> {

}
