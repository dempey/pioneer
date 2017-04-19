package com.github.dempey.pioneer.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

//@Entity
public class UserRole {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    @NotEmpty
//    @JoinColumn(name = "id")
    private User user;

//    @NotEmpty
    private String role;

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
