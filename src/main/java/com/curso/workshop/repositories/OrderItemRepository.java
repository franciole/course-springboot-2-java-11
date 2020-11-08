package com.curso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
