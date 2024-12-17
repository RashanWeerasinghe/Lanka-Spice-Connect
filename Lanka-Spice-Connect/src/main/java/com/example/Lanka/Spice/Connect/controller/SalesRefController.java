package com.example.Lanka.Spice.Connect.controller;

import com.example.Lanka.Spice.Connect.dto.response.ResponseSuppierDto;
import com.example.Lanka.Spice.Connect.service.FarmerSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/salesref/v1")
public class SalesRefController {

    @Autowired
   private final FarmerSerivce farmerSerivce;

    public SalesRefController(FarmerSerivce farmerSerivce) {
        this.farmerSerivce = farmerSerivce;
    }


    @GetMapping("/supplier")
    public List<ResponseSuppierDto> getSupplierList() {
        List<ResponseSuppierDto>results=farmerSerivce.getSupplierDetails();
        return results;
    }
}
