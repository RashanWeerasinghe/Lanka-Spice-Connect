package com.example.Lanka.Spice.Connect.dto.request;

import java.util.List;

public class RequestOrderDto {

        private Long orderId;

        private Long total;

        private String shippingAddress;

        private Long customerId;

        private List<RequestCompanyProduct> requestCompanyProductList;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public List<RequestCompanyProduct> getRequestCompanyProductList() {
        return requestCompanyProductList;
    }

    public void setRequestCompanyProductList(List<RequestCompanyProduct> requestCompanyProductList) {
        this.requestCompanyProductList = requestCompanyProductList;
    }
}
