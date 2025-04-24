package com.example.carrentalspringboot.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class PricingAdjustmentRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "min_availability")
    private String minAvailability;
    @Column(name = "max_availability")
    private String maxAvailability;
    @Column(name = "adjustment_rate")
    private BigDecimal adjustmentRate;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "created_at")
    private Timestamp createdAt;
    private Boolean active;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;

    public PricingAdjustmentRule() {
    }

    public PricingAdjustmentRule(String minAvailability, String maxAvailability, BigDecimal adjustmentRate, Integer createdBy, Timestamp createdAt, Boolean active, Date startDate, Date endDate) {
        this.minAvailability = minAvailability;
        this.maxAvailability = maxAvailability;
        this.adjustmentRate = adjustmentRate;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.active = active;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId() {
        return id;
    }

    public String getMinAvailability() {
        return minAvailability;
    }

    public void setMinAvailability(String minAvailability) {
        this.minAvailability = minAvailability;
    }

    public String getMaxAvailability() {
        return maxAvailability;
    }

    public void setMaxAvailability(String maxAvailability) {
        this.maxAvailability = maxAvailability;
    }

    public BigDecimal getAdjustmentRate() {
        return adjustmentRate;
    }

    public void setAdjustmentRate(BigDecimal adjustmentRate) {
        this.adjustmentRate = adjustmentRate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
