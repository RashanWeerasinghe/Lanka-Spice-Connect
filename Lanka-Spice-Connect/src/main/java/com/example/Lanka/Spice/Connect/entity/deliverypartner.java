package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "delivery_partner")
public class deliverypartner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "deliverypartner")
    private Set<orders> orders;
}
