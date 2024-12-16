package com.example.Lanka.Spice.Connect.controller;


import com.example.Lanka.Spice.Connect.dto.request.RequestSupplierBidDto;
import com.example.Lanka.Spice.Connect.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier/v1")
public class SupplierController {

    @Autowired
    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/bidforcinnamon")
    public String bidForCinnamon(@RequestBody RequestSupplierBidDto requestSupplierBidDto){


       String result= supplierService.bidForCinnamon(requestSupplierBidDto);

        return result;
    }


    @PostMapping("/updatesuppliercinnamonstock")
    public String UpdateSupplierCinnamonStock(@RequestBody RequestSupplierBidDto requestSupplierBidDto){
        String result= supplierService.UpdateSupplierCinnamonStock(requestSupplierBidDto);
        return result;
    }

}
