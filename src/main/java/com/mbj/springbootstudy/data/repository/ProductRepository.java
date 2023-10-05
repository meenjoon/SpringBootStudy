package com.mbj.springbootstudy.data.repository;

import com.mbj.springbootstudy.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.number =:productid")
    Optional<Product> findByNumber(@Param("productid") Long id);
}
