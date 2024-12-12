package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "company_product")
public class companyproduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  productName;
    private String productType;

    private double companyPrice;

    @ManyToMany(mappedBy = "userorders")
    Set<orders> orders;

    @ManyToOne
    @JoinColumn(name = "ecommerce_manager_id", nullable = false)
    private ecommercemanager ecommercemanager;

}
