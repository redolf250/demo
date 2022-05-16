package com.example.demo.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Component
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private boolean enabled;

    public Users(Long userId, String username, boolean enabled) {
        this.userId = userId;
        this.username = username;
        this.enabled = enabled;
    }

    public Users() {

    }

    public Long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
