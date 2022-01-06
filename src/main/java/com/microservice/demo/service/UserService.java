package com.microservice.demo.service;

import java.util.List;

import com.microservice.demo.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> getUsersByRoleName(String roleName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("roles").in(roleName));
        // query.fields().include("name").include("email");
        List<User> users = mongoTemplate.find(query, User.class);
        return users;
    }
}
