package com.example.Lanka.Spice.Connect.controller;

import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromProductListDto;
import com.example.Lanka.Spice.Connect.service.PlatfromManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
