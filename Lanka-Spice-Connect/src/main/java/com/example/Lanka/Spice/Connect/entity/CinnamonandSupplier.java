package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;

@Entity(name = "cinnamon_and_supplier")
public class CinnamonandSupplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double bidprice;
    private double quantity;

    @ManyToOne
    @JoinColumn(name = "cinnamon_id", nullable = false)
    private Cinnamon cinnamon;

    @ManyToOne
    @JoinColumn(name = "suplier_id", nullable = false)
    private Supplier suplier;

    public CinnamonandSupplier(Supplier supplier, Cinnamon cinnamon, Double bidPrice, Double quantity) {
        this.suplier = supplier;
        this.cinnamon = cinnamon;
        this.bidprice = bidPrice;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBidprice() {
        return bidprice;
    }

    public void setBidprice(double bidprice) {
        this.bidprice = bidprice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Cinnamon getCinnamon() {
        return cinnamon;
    }

    public void setCinnamon(Cinnamon cinnamon) {
        this.cinnamon = cinnamon;
    }

    public Supplier getSuplier() {
        return suplier;
    }

    public void setSuplier(Supplier suplier) {
        this.suplier = suplier;
    }
}
