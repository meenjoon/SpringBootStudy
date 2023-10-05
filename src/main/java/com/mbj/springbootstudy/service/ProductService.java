package com.mbj.springbootstudy.service;

import com.mbj.springbootstudy.dto.ProductDto;
import com.mbj.springbootstudy.dto.ProductAddRequestDto;

public interface ProductService {
    ProductDto read(Long id);

    void create(ProductAddRequestDto productAddDto);
}
