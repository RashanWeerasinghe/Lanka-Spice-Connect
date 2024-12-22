package com.example.Lanka.Spice.Connect.service.impl;

import com.example.Lanka.Spice.Connect.dto.request.RequestCompanyProduct;
import com.example.Lanka.Spice.Connect.dto.request.RequestOrderDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponseCompanyProduct;
import com.example.Lanka.Spice.Connect.entity.*;
import com.example.Lanka.Spice.Connect.repo.*;
import com.example.Lanka.Spice.Connect.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private final CompanyProductRepo companyProductRepo;

    @Autowired
    private final OrderRepo orderRepo;


    @Autowired
    private final CustomerRepo customerRepo;

    @Autowired
    private final DeliveryPartnerRepo deliveryPartnerRepo;

    @Autowired
    private final OrderProductRepo orderProductRepo;

    public CustomerServiceImpl(CompanyProductRepo companyProductRepo, OrderRepo orderRepo, CustomerRepo customerRepo, DeliveryPartnerRepo deliveryPartnerRepo, OrderProductRepo orderProductRepo) {
        this.companyProductRepo = companyProductRepo;
        this.orderRepo = orderRepo;
        this.customerRepo = customerRepo;
        this.deliveryPartnerRepo = deliveryPartnerRepo;
        this.orderProductRepo = orderProductRepo;
    }


    @Override
    public List<ResponseCompanyProduct> getCompanyProductList() {

        List<ResponseCompanyProduct> result= companyProductRepo.findAll().stream().map(companyProduct -> {
            ResponseCompanyProduct responseCompanyProduct = new ResponseCompanyProduct();
            responseCompanyProduct.setProductId(companyProduct.getId());
            responseCompanyProduct.setProductName(companyProduct.getProductName());
            responseCompanyProduct.setProductType(companyProduct.getProductType());
            responseCompanyProduct.setPrice(companyProduct.getCompanyPrice());

            return responseCompanyProduct;

        }).collect(Collectors.toList());

        return result;
    }




    @Transactional
    @Override
    public String order(RequestOrderDto requestOrderDto) {

        try {


            Customer customer = customerRepo
                    .findById(requestOrderDto.getCustomerId())
                    .orElseThrow(() -> new RuntimeException("Customer not found with id: " + requestOrderDto.getCustomerId()));



            DeliveryPartner deliveryPartner = deliveryPartnerRepo
                    .findById(1001L)
                    .orElseThrow(() -> new RuntimeException("Delivery Partner not found with id: "));


            Orders order = new Orders(
                    requestOrderDto.getOrderId(),
                    requestOrderDto.getTotal(),
                    requestOrderDto.getShippingAddress(),
                    null,
                    customer,
                    deliveryPartner
            );

            orderRepo.save(order);




            Orders order1 = orderRepo.findById(requestOrderDto.getOrderId()).orElseThrow(() -> new RuntimeException("Order not found with id: " + requestOrderDto.getOrderId()));


            Set<Orders_Product> orders_products = requestOrderDto
                    .getRequestCompanyProductList().stream().map(requestCompanyProduct -> {
                        Orders_Product orders_products1 = new Orders_Product();
                        orders_products1.setId(requestCompanyProduct.getOrder_product_id());

                        CompanyProduct companyProduct = companyProductRepo
                                .findById(requestCompanyProduct.getProduct_id())
                                .orElseThrow(() -> new RuntimeException("Company Product not found with id: " + requestCompanyProduct.getProduct_id()));

                        orders_products1.setProduct(companyProduct);

                        orders_products1.setOrder(order1);



                        return orders_products1;
                    }).collect(Collectors.toSet());

            order.setUserorders(orders_products);


            for(Orders_Product orders_products1: orders_products) {
                System.out.println(orders_products1.getId());
                System.out.println(orders_products1.getOrder().getId());
                System.out.println(orders_products1.getProduct().getId());

                orderProductRepo.save(orders_products1);


            }

            System.out.println("Order Success");

             return "Order Success";

        } catch (Exception e) {
            System.out.println(e);
            return "Order Failed";
        }


    }
}
