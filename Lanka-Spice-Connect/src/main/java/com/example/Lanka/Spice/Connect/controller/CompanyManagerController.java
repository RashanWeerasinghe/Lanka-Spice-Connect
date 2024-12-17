package com.example.Lanka.Spice.Connect.controller;

import com.example.Lanka.Spice.Connect.dto.response.ResponseSalesRepresentativeDto;
import com.example.Lanka.Spice.Connect.service.CompanyManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companymanager/v1")
public class CompanyManagerController {

    @Autowired
    private final CompanyManagerService companyManagerService;

    public CompanyManagerController(CompanyManagerService companyManagerService) {
        this.companyManagerService = companyManagerService;
    }

    @GetMapping("/salesrepresentative")
    public List<ResponseSalesRepresentativeDto> getSalesRepresentativeList() {
        List<ResponseSalesRepresentativeDto> results = companyManagerService.getSalesRepresentativeDetails();
        return results;
    }

    @PostMapping("/salesre/assign")
    public String AssignSalesRepresentative(@RequestParam Long id, @RequestParam Long salesRepId) {
        String result=companyManagerService.assignSalesRepresentative(id,salesRepId);
        return "Sales Representative Assigned";
    }


}
