package com.example.Lanka.Spice.Connect.dto.request;

import com.example.Lanka.Spice.Connect.entity.EcommerceManager;
import com.example.Lanka.Spice.Connect.entity.Orders;

import javax.persistence.*;
import java.util.Set;


public class RequestCompanyProduct {

    private Long product_id;

    private Long order_product_id;

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getOrder_product_id() {
        return order_product_id;
    }

    public void setOrder_product_id(Long order_product_id) {
        this.order_product_id = order_product_id;
    }
}
