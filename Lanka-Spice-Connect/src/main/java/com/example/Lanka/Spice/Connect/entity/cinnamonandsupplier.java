package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;

@Entity(name = "cinnamon_and_supplier")
public class cinnamonandsupplier {

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

}
