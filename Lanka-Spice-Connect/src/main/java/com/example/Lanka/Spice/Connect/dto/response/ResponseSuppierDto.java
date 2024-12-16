package com.example.Lanka.Spice.Connect.dto.response;

public class ResponseSuppierDto {
    private Long suplierId;
    private String suplierArea;
    private String cinnamonType;
    private double buyPrice;
    private String quantity;
    private double sellPrice;

    public Long getSuplierId() {
        return suplierId;
    }

    public void setSuplierId(Long suplierId) {
        this.suplierId = suplierId;
    }

    public String getSuplierArea() {
        return suplierArea;
    }

    public void setSuplierArea(String suplierArea) {
        this.suplierArea = suplierArea;
    }

    public String getCinnamonType() {
        return cinnamonType;
    }

    public void setCinnamonType(String cinnamonType) {
        this.cinnamonType = cinnamonType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
