package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "sales_representative")
public class salesrepresentative {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cinnamonType;
    private String quantity;
    private double BuyPrice;
}
