package com.microservice.demo;

import java.util.Arrays;

import com.microservice.demo.models.User;
import com.microservice.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsersServiceApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UsersServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// userRepository.save(new User("1", "mouad", "mouadiken2@gmail.com", "password", Arrays.asList("ROLE_USER")));
	  System.out.println( "started " );
	}
}
