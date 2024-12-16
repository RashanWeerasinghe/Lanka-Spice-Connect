package com.example.Lanka.Spice.Connect.controller;

import com.example.Lanka.Spice.Connect.dto.request.RequestCinnamonDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponseSuppierDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Lanka.Spice.Connect.service.FarmerSerivce;

import java.util.List;

@RestController
@RequestMapping("/farmer/v1")
public class FarmerController {

@Autowired
private FarmerSerivce farmerservice;


    @GetMapping("/viewsuppliers")
    public List<ResponseSuppierDto> viewSuppliers(){
          List<ResponseSuppierDto> responseSuppierDto = farmerservice.getSupplierDetails();
          return responseSuppierDto;
    }

    @PostMapping("/addcinnamon")
    public String AddCinnamon(@RequestBody RequestCinnamonDto requestCinnamonDto, @RequestParam Long farmerId){
        System.out.println(farmerId);
        String result = farmerservice.addCinnamon(requestCinnamonDto, farmerId);
        return "Cinnamon Added";
    }

}
