package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "sales_representative")
public class SalesRepresentative {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cinnamonType;
    private String quantity;
    private double BuyPrice;

    @OneToMany(mappedBy = "salesrepresentative")
    private Set<Supplier>suppliers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCinnamonType() {
        return cinnamonType;
    }

    public void setCinnamonType(String cinnamonType) {
        this.cinnamonType = cinnamonType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getBuyPrice() {
        return BuyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        BuyPrice = buyPrice;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}


