package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "company_manager")
public class companymanager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
