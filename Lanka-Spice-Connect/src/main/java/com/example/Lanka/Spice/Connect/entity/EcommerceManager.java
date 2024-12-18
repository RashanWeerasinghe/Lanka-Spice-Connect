package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "ecommerce_manager")
public class EcommerceManager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

    @OneToMany(mappedBy = "ecommercemanager")
    private Set<CompanyProduct> companyproducts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<CompanyProduct> getCompanyproducts() {
        return companyproducts;
    }

    public void setCompanyproducts(Set<CompanyProduct> companyproducts) {
        this.companyproducts = companyproducts;
    }
}
