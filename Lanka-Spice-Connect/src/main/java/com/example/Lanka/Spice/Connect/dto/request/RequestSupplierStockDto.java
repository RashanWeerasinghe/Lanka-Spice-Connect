package com.example.Lanka.Spice.Connect.dto.request;

public class RequestSupplierStockDto {
private Long supplierId;

private double quantity;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
