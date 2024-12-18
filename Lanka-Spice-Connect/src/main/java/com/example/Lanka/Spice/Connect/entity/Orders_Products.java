package com.example.Lanka.Spice.Connect.entity;

import javax.persistence.*;

@Entity(name = "orders_products")
public class Orders_Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private CompanyProduct product;

    public Orders_Products() {

    }

    public Orders_Products(long l, CompanyProduct companyProduct) {
        this.id = l;
        this.product = companyProduct;
    }

    public Orders_Products(CompanyProduct companyProduct) {
        this.product = companyProduct;
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
