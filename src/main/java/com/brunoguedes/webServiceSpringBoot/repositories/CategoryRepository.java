package com.brunoguedes.webServiceSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoguedes.webServiceSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
