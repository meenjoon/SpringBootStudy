package com.mbj.springbootstudy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductAddRequestDto {

    private String name;

    private int price;

    private int stock;
}
