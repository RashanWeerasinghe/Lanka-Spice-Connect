package com.example.Lanka.Spice.Connect.dto.request;

public class RequestSupplierBidDto {
    private Long supplierId;
    private double bidprice;

    private double quantity;

    private long cinnamonId;

    public RequestSupplierBidDto(Long supplierId, double bidprice, double quantity, long cinnamonId) {
        this.supplierId = supplierId;
        this.bidprice = bidprice;
        this.quantity = quantity;
        this.cinnamonId = cinnamonId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public double getBidprice() {
        return bidprice;
    }

    public void setBidprice(double bidprice) {
        this.bidprice = bidprice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public long getCinnamonId() {
        return cinnamonId;
    }

    public void setCinnamonId(long cinnamonId) {
        this.cinnamonId = cinnamonId;
    }
}
