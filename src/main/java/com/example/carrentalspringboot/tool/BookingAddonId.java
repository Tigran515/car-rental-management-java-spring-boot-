package com.example.carrentalspringboot.tool;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class BookingAddonId implements Serializable { //@TODO: check and compare
    @Column(name = "booking_id")
    private Long bookingId;
    @Column(name = "addon_id")
    private Long addonId;

    public BookingAddonId() {
    }

    public BookingAddonId(Long bookingId, Long addonId) {
        this.bookingId = bookingId;
        this.addonId = addonId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Long getAddonId() {
        return addonId;
    }

    public void setAddonId(Long addonId) {
        this.addonId = addonId;
    }
}
