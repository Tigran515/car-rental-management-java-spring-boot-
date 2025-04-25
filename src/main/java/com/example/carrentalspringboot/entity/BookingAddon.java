package com.example.carrentalspringboot.entity;

import com.example.carrentalspringboot.tool.BookingAddonId;
import jakarta.persistence.*;

@Entity
@Table(name = "booking_addon")
public class BookingAddon {
    @EmbeddedId
    private BookingAddonId bookingAddonId;

    public BookingAddon() {
    }

    public BookingAddon(BookingAddonId id) {
        this.bookingAddonId = id;
    }

    public BookingAddonId getBookingAddonId() {
        return bookingAddonId;
    }
}

