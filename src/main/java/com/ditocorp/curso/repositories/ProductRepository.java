package com.ditocorp.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ditocorp.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
