package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "company_product")
public class CompanyProduct {

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
    private EcommerceManager ecommercemanager;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getCompanyPrice() {
        return companyPrice;
    }

    public void setCompanyPrice(double companyPrice) {
        this.companyPrice = companyPrice;
    }

    public Set<com.example.Lanka.Spice.Connect.entity.orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<com.example.Lanka.Spice.Connect.entity.orders> orders) {
        this.orders = orders;
    }

    public EcommerceManager getEcommercemanager() {
        return ecommercemanager;
    }

    public void setEcommercemanager(EcommerceManager ecommercemanager) {
        this.ecommercemanager = ecommercemanager;
    }
}
