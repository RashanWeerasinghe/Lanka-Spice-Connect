package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "ecommerce_manager")
public class ecommercemanager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

    @OneToMany(mappedBy = "ecommercemanager")
    private Set<companyproduct> companyproducts;

}
