package com.example.Lanka.Spice.Connect.dto.response;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ResponsePlatfromProductListDto {


    private Long id;
    private String  productName;
    private String productType;

    private double companyPrice;

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
}
