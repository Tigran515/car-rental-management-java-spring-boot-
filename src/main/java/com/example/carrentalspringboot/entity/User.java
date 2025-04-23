package com.example.carrentalspringboot.entity;

import com.example.carrentalspringboot.enums.RoleEnum;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
//@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String name;
    private String lname;
    private String sname;
    @Enumerated(EnumType.STRING)
    private RoleEnum role;
    @Column(name = "created_at")
    private Timestamp created;
    @Column(name = "last_connection")
    private Timestamp lastConnection;
    private Boolean active;

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getLastConnection() {
        return lastConnection;
    }

    public void setLastConnection(Timestamp lastConnection) {
        this.lastConnection = lastConnection;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
