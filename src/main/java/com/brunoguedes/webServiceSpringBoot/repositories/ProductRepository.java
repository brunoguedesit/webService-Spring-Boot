package com.brunoguedes.webServiceSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoguedes.webServiceSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
