package com.example.carrentalspringboot.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.example.carrentalspringboot.enums.AccidentTypeEnum;
import com.example.carrentalspringboot.enums.AccidentStatusEnum;

@Entity
@Table(name = "accident_report")
public class AccidentReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Enumerated(EnumType.STRING)
    private AccidentTypeEnum type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;
    @Enumerated(EnumType.STRING)
    private AccidentStatusEnum status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;
    private BigDecimal fee;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private User manager;
    @Column(name = "created_at")
    private Timestamp createdAt;
    //    @CreationTimestamp
//    @Column(updatable = false)
//    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private Timestamp updated;
    private String notes;

    //    @UpdateTimestamp
//    private LocalDateTime updatedAt;
    public AccidentReport() {
    }

    public Integer getId() {
        return id;
    }

    public AccidentTypeEnum getType() {
        return type;
    }

    public void setType(AccidentTypeEnum type) {
        this.type = type;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public AccidentStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AccidentStatusEnum status) {
        this.status = status;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
