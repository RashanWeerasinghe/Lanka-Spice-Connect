package com.example.Lanka.Spice.Connect.dto.response;

public class ResponseSalesRepresentativeDto {
    private Long id;

    private String cinnamonType;

    private String quantity;
    private double BuyPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCinnamonType() {
        return cinnamonType;
    }

    public void setCinnamonType(String cinnamonType) {
        this.cinnamonType = cinnamonType;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getBuyPrice() {
        return BuyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        BuyPrice = buyPrice;
    }
}
