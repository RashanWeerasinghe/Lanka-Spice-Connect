package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "customer")
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToMany(mappedBy = "customer")
    private Set<orders> orders;
}
