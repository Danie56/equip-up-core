package com.example.equipupcore.repository.product;

import com.example.equipupcore.repository.user.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDto,Long> {

}
