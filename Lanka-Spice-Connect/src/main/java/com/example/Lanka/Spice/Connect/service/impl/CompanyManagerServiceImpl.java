package com.example.Lanka.Spice.Connect.service.impl;

import com.example.Lanka.Spice.Connect.dto.response.ResponseSalesRepresentativeDto;
import com.example.Lanka.Spice.Connect.entity.SalesRepresentative;
import com.example.Lanka.Spice.Connect.repo.SalesRepresentativeRepo;
import com.example.Lanka.Spice.Connect.repo.SupplierRepo;
import com.example.Lanka.Spice.Connect.service.CompanyManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyManagerServiceImpl implements CompanyManagerService {

    @Autowired
    private final SalesRepresentativeRepo salesRepresentativeRepo;


    @Autowired
    private final SupplierRepo supplierRepo;

    public CompanyManagerServiceImpl(SalesRepresentativeRepo salesRepresentativeRepo, SupplierRepo supplierRepo) {
        this.salesRepresentativeRepo = salesRepresentativeRepo;
        this.supplierRepo = supplierRepo;
    }

    @Override
    public List<ResponseSalesRepresentativeDto> getSalesRepresentativeDetails() {

        try{
            List<ResponseSalesRepresentativeDto> results = salesRepresentativeRepo.findAll().stream().map(salesRepresentative -> {
                ResponseSalesRepresentativeDto responseSalesRepresentativeDto = new ResponseSalesRepresentativeDto();
                responseSalesRepresentativeDto.setId(salesRepresentative.getId());
                responseSalesRepresentativeDto.setBuyPrice(salesRepresentative.getBuyPrice());
                responseSalesRepresentativeDto.setCinnamonType(salesRepresentative.getCinnamonType());
                responseSalesRepresentativeDto.setQuantity(salesRepresentative.getQuantity());
                return responseSalesRepresentativeDto;
            }).collect(Collectors.toList());
            return results;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    @Transactional
    public String assignSalesRepresentative(Long id, Long salesRepId) {
        try{

            SalesRepresentative salesRepresentative = salesRepresentativeRepo
                    .findById(salesRepId)
                    .orElseThrow(() -> new RuntimeException("Sales Representative Not Found"));

            supplierRepo.UpdateSalesRepresentative(id,salesRepresentative);
            return "Sales Representative Assigned";

        }catch (Exception e){
            e.printStackTrace();
            return "Error";
        }

    }
}
