package com.curso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
