package com.example.equipupcore.controller.image;

import com.example.equipupcore.model.Image;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ImageRequestMapper {

  @Mapping(target = "product.id", source = "productId")
  Image toEntity(ImageRequest imageRequest);

  List<Image> toEntity(List<ImageRequest> imageRequests);
}