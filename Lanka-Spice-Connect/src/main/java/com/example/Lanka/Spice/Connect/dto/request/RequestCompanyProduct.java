package com.example.Lanka.Spice.Connect.dto.request;

import com.example.Lanka.Spice.Connect.entity.EcommerceManager;
import com.example.Lanka.Spice.Connect.entity.Orders;

import javax.persistence.*;
import java.util.Set;


public class RequestCompanyProduct {

    private Long id;

    private long order_product_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
