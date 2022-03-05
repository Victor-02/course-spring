package com.course.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
