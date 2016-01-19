package com.boom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRoles {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String username;
    private String role;


    protected UserRoles() {}

    public UserRoles(String username, String role){
        this.username = username;
        this.role     = role;
    }

    @Override
    public String toString() {
        return String.format("UserRoles[id=%d]", id);
    }

}
