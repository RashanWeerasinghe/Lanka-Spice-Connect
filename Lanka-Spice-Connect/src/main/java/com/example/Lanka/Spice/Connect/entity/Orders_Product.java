package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;

@Entity(name = "orders_product")
public class Orders_Product {

    @Id
    private Long id;


    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private CompanyProduct product;

    public Orders_Product(Long l, Orders order, CompanyProduct companyProduct) {
        this.id = l;
        this.order = order;
        this.product = companyProduct;
    }

    public Orders_Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public CompanyProduct getProduct() {
        return product;
    }

    public void setProduct(CompanyProduct product) {
        this.product = product;
    }
}
