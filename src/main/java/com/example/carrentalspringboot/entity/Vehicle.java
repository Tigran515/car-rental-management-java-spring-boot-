package com.example.carrentalspringboot.entity;

import com.example.carrentalspringboot.enums.VehicleTypeEnum;
import jakarta.persistence.*;
import org.springframework.data.repository.cdi.Eager;

import java.math.BigDecimal;
import java.time.Year;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String make;
    private String name;
    private Year year; //@TODO: check
    @Column(name = "licence_plate")
    private String licencePlate;
    @Enumerated(EnumType.STRING)
    private VehicleTypeEnum type;
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public VehicleTypeEnum getType() {
        return type;
    }

    public void setType(VehicleTypeEnum type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
