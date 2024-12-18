package com.example.Lanka.Spice.Connect.service.impl;

import com.example.Lanka.Spice.Connect.dto.request.RequestOrderDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponseCompanyProduct;
import com.example.Lanka.Spice.Connect.entity.*;
import com.example.Lanka.Spice.Connect.repo.CompanyProductRepo;
import com.example.Lanka.Spice.Connect.repo.CustomerRepo;
import com.example.Lanka.Spice.Connect.repo.DeliveryPartnerRepo;
import com.example.Lanka.Spice.Connect.repo.OrderRepo;
import com.example.Lanka.Spice.Connect.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
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

    public CustomerServiceImpl(CompanyProductRepo companyProductRepo, OrderRepo orderRepo, CustomerRepo customerRepo, DeliveryPartnerRepo deliveryPartnerRepo) {
        this.companyProductRepo = companyProductRepo;
        this.orderRepo = orderRepo;
        this.customerRepo = customerRepo;
        this.deliveryPartnerRepo = deliveryPartnerRepo;
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
            Customer customer = customerRepo.findById(requestOrderDto.getCustomerId()).get();

            DeliveryPartner deliveryPartner =  deliveryPartnerRepo.getReferenceById(1001L);

            Set<Orders_Products> orders_products = requestOrderDto.getRequestCompanyProductList().stream().map(product -> {
                CompanyProduct companyProduct = companyProductRepo.findById(product.getId()).get();
                return new Orders_Products(
                        companyProduct

                );
            }).collect(Collectors.toSet());

            Orders order = new Orders(
                    requestOrderDto.getOrderId(),
                    requestOrderDto.getTotal(),
                    requestOrderDto.getShippingAddress(),
                    orders_products,
                    customer,
                    deliveryPartner

            );

            orderRepo.save(order);

            return "Order Added";

        }catch (Exception e){
            e.printStackTrace();
            return "Order Not Added";
        }


    }
}
