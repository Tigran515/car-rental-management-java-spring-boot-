package com.example.carrentalspringboot.repository;

import com.example.carrentalspringboot.entity.BookingAddon;
import com.example.carrentalspringboot.tool.BookingAddonId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingAddonRepository extends JpaRepository<BookingAddon, BookingAddonId> {
}
