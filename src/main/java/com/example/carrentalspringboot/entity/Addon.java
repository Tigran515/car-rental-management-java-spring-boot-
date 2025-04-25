package com.example.carrentalspringboot.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "addon")
public class Addon { // @TODO: decide is it necessary to override equals() and hashCode()
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;

    public Addon() {
    }

    public Addon(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
