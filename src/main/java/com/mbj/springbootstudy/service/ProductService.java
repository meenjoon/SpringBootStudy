package com.mbj.springbootstudy.service;

import com.mbj.springbootstudy.dto.ProductDto;

public interface ProductService {
    ProductDto read(Long id);
}
