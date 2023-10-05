package com.mbj.springbootstudy.controller;

import com.mbj.springbootstudy.dto.ProductDto;
import com.mbj.springbootstudy.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    // [EX] ("product/3") Product 조회
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> readProduct(@PathVariable("id") Long id){
        ProductDto product = productService.read(id);
        System.out.println(product);
        if (product == null){
            return new ResponseEntity<>("현재 id로 조회되는 Product가 없습니다.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(product , HttpStatus.OK);
    }
}
