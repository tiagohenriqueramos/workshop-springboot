package com.tiago.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
