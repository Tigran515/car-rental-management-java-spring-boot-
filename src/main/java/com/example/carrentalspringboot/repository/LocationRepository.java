package com.example.carrentalspringboot.repository;

import com.example.carrentalspringboot.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
