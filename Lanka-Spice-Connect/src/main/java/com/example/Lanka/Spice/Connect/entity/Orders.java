package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double total;

    private String shippingAddress;


    @OneToMany(mappedBy = "order")
    private Set<Orders_Products> userorders;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "delivery_partner_id", nullable = false)
    private DeliveryPartner deliverypartner;

    public Orders() {
    }

    public Orders(
            Long orderId,
            Long total,
            String shippingAddress,
            Set collect,
            Customer customer,
            DeliveryPartner deliverypartner) {

        this.id = orderId;
        this.total = total;
        this.shippingAddress = shippingAddress;
        this.userorders = collect;
        this.customer = customer;
        this.deliverypartner = deliverypartner;
    }


    public Set<Orders_Products> getUserorders() {
        return userorders;
    }

    public void setUserorders(Set<Orders_Products> userorders) {
        this.userorders = userorders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryPartner getDeliverypartner() {
        return deliverypartner;
    }

    public void setDeliverypartner(DeliveryPartner deliverypartner) {
        this.deliverypartner = deliverypartner;
    }
}
