package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "orders")
public class orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double total;

    @ManyToMany
    @JoinTable(
            name = "orders_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    Set<CompanyProduct> userorders;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private customer customer;

    @ManyToOne
    @JoinColumn(name = "delivery_partner_id", nullable = false)
    private deliverypartner deliverypartner;

}
