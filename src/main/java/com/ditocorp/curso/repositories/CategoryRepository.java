package com.ditocorp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
