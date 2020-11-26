package com.brunoguedes.webServiceSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoguedes.webServiceSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
