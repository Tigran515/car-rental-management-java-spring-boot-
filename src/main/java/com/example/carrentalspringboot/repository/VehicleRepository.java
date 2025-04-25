package com.example.carrentalspringboot.repository;

import com.example.carrentalspringboot.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
