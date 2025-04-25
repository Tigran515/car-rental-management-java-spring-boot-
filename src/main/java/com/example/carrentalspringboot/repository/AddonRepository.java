package com.example.carrentalspringboot.repository;

import com.example.carrentalspringboot.entity.Addon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddonRepository extends JpaRepository<Addon, Integer> {
}
