package com.course.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
