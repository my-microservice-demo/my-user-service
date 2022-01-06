package com.microservice.demo.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    private String name;

    private String email;

    private String password;

    private List<String> roles;

    
}
