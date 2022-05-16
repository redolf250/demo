package com.example.demo.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersTest {

    @Autowired
    private Users users;

    @BeforeEach
    void setUp() {
        new Users(1l, "redolf", true);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getUserId() {
        users.getUserId();
        Assertions.assertNotNull(users);
    }

    @Test
    void getUsername() {
        users.getUsername();
    }

    @Test
    void setUsername() {
        users.setUsername("Aamaning");

    }

    @Test
    void isEnabled() {
    }

    @Test
    void setEnabled() {
    }
}