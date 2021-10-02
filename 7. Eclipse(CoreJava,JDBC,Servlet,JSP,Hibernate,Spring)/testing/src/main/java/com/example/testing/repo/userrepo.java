package com.example.testing.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.model.User;

public interface userrepo extends JpaRepository<User, Integer> {

	
}
