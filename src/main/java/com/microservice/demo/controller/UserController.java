package com.microservice.demo.controller;

import java.util.List;

import com.microservice.demo.models.User;
import com.microservice.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{role}")
    public List<User> getUserByRole(@PathVariable(required = true, value = "role") String role) {
        return userService.getUsersByRoleName(role);
    }

}
