package com.mbj.springbootstudy.service;

import com.mbj.springbootstudy.data.entity.Product;
import com.mbj.springbootstudy.data.repository.ProductRepository;
import com.mbj.springbootstudy.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ProductDto read(Long id) {
        Optional<Product> findProduct = productRepository.findByNumber(id);
        if (findProduct.isEmpty()) {
            return null;
        } else {
            ProductDto productDto = new ProductDto(findProduct.get().getName(), findProduct.get().getPrice(), findProduct.get().getCreatedAt());
            return productDto;
        }
    }
}
