package com.example.Lanka.Spice.Connect.service;

import com.example.Lanka.Spice.Connect.dto.request.RequestOrderDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponseCompanyProduct;

import java.util.List;

public interface CustomerService {
    List<ResponseCompanyProduct> getCompanyProductList();

    String order(RequestOrderDto requestOrderDto);
}
