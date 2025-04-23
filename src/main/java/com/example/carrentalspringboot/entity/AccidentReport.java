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
    @Column(name = "customer_id")
    private Integer customerId;
    @Enumerated(EnumType.STRING)
    private AccidentStatusEnum status;
    @Column(name = "booking_id")
    private Integer bookingId;
    private BigDecimal fee;
    @Column(name = "manager_id")
    private Integer managerId;
    @Column(name = "created_at")
    private Timestamp created;
    @Column(name = "updated_at")
    private Timestamp updated;
    private String notes;

    public AccidentReport() {
    }
//@TODO: add constructor with args
    public Integer getId() {
        return id;
    }

    public AccidentTypeEnum getType() {
        return type;
    }

    public void setType(AccidentTypeEnum type) {
        this.type = type;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public AccidentStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AccidentStatusEnum status) {
        this.status = status;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
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
