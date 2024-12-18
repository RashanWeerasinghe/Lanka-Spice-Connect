package com.example.Lanka.Spice.Connect.controller;

import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromManagerOrdersDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromProductListDto;
import com.example.Lanka.Spice.Connect.service.PlatfromManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/platform/v1")
public class PlatfromManager {

    @Autowired
    private final PlatfromManagerService platfromManagerService;

    public PlatfromManager(PlatfromManagerService platfromManagerService) {
        this.platfromManagerService = platfromManagerService;
    }

    @GetMapping("/productlist")
    public List<ResponsePlatfromProductListDto> getPlatfromProductList() {

        List<ResponsePlatfromProductListDto> results = platfromManagerService.getPlatfromProductList();
        return results;
    }

    @PostMapping("/addproduct")
    public String addProduct(@RequestBody ResponsePlatfromProductListDto responsePlatfromProductListDto,@RequestParam Long platfromId) {
        String result = platfromManagerService.addProduct(responsePlatfromProductListDto,platfromId);
        return "Product Added";
    }

    @GetMapping("/orderslist")
    public List<ResponsePlatfromManagerOrdersDto> getPlatfromOrdersList() {
        List<ResponsePlatfromManagerOrdersDto> results = platfromManagerService.getPlatfromOrdersList();
        return results;
    }

    @PostMapping("/assignorder")
    public String assignOrderToDeliveryBoy(@RequestParam Long orderId, @RequestParam Long deliveryBoyId) {
        String result = platfromManagerService.assignOrderToDeliveryBoy(orderId, deliveryBoyId);
        return "Order Assigned";
    }

}
