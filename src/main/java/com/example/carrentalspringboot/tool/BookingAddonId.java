package com.example.carrentalspringboot.tool;

import com.example.carrentalspringboot.entity.Addon;
import com.example.carrentalspringboot.entity.Booking;
import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class BookingAddonId implements Serializable { //@TODO: check and compare
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addon_id")
    private Addon addon;

    public BookingAddonId() {
    }

    public BookingAddonId(Booking booking, Addon addon) {
        this.booking = booking;
        this.addon = addon;
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
