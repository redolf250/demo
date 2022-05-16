package com.example.demo.service;

import com.example.demo.entities.Users;
import com.example.demo.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class users {

    private final UsersRepository repository;

    public users(UsersRepository repository) {
        this.repository = repository;
    }

    public List<Users> getAllUsers() {
        List<Users> list = repository.findAll();
        return list;
    }
}
