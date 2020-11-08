package com.curso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
