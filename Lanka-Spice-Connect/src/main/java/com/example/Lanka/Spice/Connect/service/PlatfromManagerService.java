package com.example.Lanka.Spice.Connect.service;

import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromManagerOrdersDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromProductListDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface PlatfromManagerService {
    List<ResponsePlatfromProductListDto> getPlatfromProductList();


    @Transactional
    String addProduct(ResponsePlatfromProductListDto responsePlatfromProductListDto, Long platfromId);

    List<ResponsePlatfromManagerOrdersDto> getPlatfromOrdersList();

    String assignOrderToDeliveryBoy(Long orderId, Long deliveryBoyId);
}
