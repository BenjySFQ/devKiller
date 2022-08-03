package com.bcp.devkiller.model;

import javax.persistence.*;

@Entity
@Table(name="TBL_USER")
public class User {
    @Id
    @GeneratedValue
    @Column(name="ID_USER")
    private Long id;

    @Column(nullable = false, unique = true,name="NOMBRES")
    private String username;

    @Column(nullable = false, unique = true,name="APELLIDOS")
    private String apellidos;



    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public String getApellidos() {
        return apellidos;
    }
}
