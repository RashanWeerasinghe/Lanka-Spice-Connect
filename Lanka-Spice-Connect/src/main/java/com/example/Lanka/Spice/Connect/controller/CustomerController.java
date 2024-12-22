package com.example.Lanka.Spice.Connect.controller;

import com.example.Lanka.Spice.Connect.dto.request.RequestOrderDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponseCompanyProduct;
import com.example.Lanka.Spice.Connect.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/productlist")
    public List<ResponseCompanyProduct> getCompanyProductList() {

        List<ResponseCompanyProduct> results = customerService.getCompanyProductList();

        return results;
    }

    @PostMapping("/order")
    public String order(@RequestBody RequestOrderDto requestOrderDto) {

        String result = customerService.order(requestOrderDto);

        return result;
    }

}
