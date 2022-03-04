package com.course.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
