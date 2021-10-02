package com.example.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.testing.model.User;
import com.example.testing.repo.userrepo;

@SpringBootApplication
public class TestingApplication implements CommandLineRunner{
	
	@Autowired
	private userrepo repo;

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new User(12,"Nishchal"));
		repo.save(new User(13,"abc"));
		repo.save(new User(14,"def"));
		
	}

}
