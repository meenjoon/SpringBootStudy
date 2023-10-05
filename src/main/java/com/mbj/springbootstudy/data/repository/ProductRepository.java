package com.mbj.springbootstudy.data.repository;

import com.mbj.springbootstudy.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
