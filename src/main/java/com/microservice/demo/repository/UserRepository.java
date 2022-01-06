package com.microservice.demo.repository;

import java.util.List;

import com.microservice.demo.models.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends MongoRepository<User, String> {
 

}
