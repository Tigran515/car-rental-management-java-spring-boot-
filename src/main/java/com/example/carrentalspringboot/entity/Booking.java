package com.example.carrentalspringboot.entity;

import com.example.carrentalspringboot.enums.PaymentMethodEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "vehicle_id")
    private Integer vehicleId;
    @Column(name = "pick_up_location_id")
    private Integer pickUpLocationId;
    @Column(name = "drop_off_location_id")
    private Integer dropOffLocationId;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "service_id")
    private Integer serviceId; //@TODO: Change to Set or List
    @Column(name = "payment_method")
    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethod;
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    public Booking() {
    }

    public Booking(Integer userId, Integer vehicleId, Integer pickUpLocationId, Integer dropOffLocationId, Date startDate, Date endDate, Integer serviceId, PaymentMethodEnum paymentMethod, BigDecimal totalPrice) {
        this.userId = userId;
        this.vehicleId = vehicleId;
        this.pickUpLocationId = pickUpLocationId;
        this.dropOffLocationId = dropOffLocationId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.serviceId = serviceId;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Integer getPickUpLocationId() {
        return pickUpLocationId;
    }

    public void setPickUpLocationId(Integer pickUpLocationId) {
        this.pickUpLocationId = pickUpLocationId;
    }

    public Integer getDropOffLocationId() {
        return dropOffLocationId;
    }

    public void setDropOffLocationId(Integer dropOffLocationId) {
        this.dropOffLocationId = dropOffLocationId;
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

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
