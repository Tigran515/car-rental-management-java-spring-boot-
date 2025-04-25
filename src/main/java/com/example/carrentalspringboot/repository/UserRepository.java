package com.example.carrentalspringboot.repository;

import com.example.carrentalspringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
