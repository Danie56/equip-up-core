package com.example.equipupcore.repository.image;

import com.example.equipupcore.model.Image;
import com.example.equipupcore.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;

@Mapper
public interface ImageRepositoryMapper extends EntityToDto<Image, ImageDto> {

}
