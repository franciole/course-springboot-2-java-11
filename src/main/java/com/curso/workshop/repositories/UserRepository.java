package com.curso.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
