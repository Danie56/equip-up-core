package com.example.equipupcore.repository.image;

import com.example.equipupcore.repository.user.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageDto,Long> {
  ImageDto findByProductId(Long productId);


}
