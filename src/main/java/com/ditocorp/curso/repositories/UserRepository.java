package com.ditocorp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
