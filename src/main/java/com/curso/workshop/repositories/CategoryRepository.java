package com.curso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
