package com.cha.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cha.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findByName(String name);
}
