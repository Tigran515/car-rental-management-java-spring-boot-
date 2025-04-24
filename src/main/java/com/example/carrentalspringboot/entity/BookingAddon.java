package com.example.carrentalspringboot.entity;

import com.example.carrentalspringboot.tool.BookingAddonId;
import jakarta.persistence.*;

@Entity
@Table(name = "booking_addon")
public class BookingAddon {
    @EmbeddedId
    private BookingAddonId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("bookingId")
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("addonId")
    @JoinColumn(name = "addon_id", nullable = false)
    private Addon addon;

    public BookingAddon() {
    }

    public BookingAddon(Booking booking, Addon addon) {
        this.booking = booking;
        this.addon = addon;
    }

    public BookingAddonId getId() {
        return id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Addon getAddon() {
        return addon;
    }

    public void setAddon(Addon addon) {
        this.addon = addon;
    }
}

