package com.example.Lanka.Spice.Connect.service.impl;

import com.example.Lanka.Spice.Connect.dto.request.RequestCinnamonDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponseSuppierDto;
import com.example.Lanka.Spice.Connect.entity.Farmer;
import com.example.Lanka.Spice.Connect.entity.Supplier;
import com.example.Lanka.Spice.Connect.entity.Cinnamon;
import com.example.Lanka.Spice.Connect.repo.CinnamonRepo;
import com.example.Lanka.Spice.Connect.repo.FarmerRepo;
import com.example.Lanka.Spice.Connect.service.FarmerSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Lanka.Spice.Connect.repo.SupplierRepo;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.GeneratedValue;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FarmerServiceImpl implements FarmerSerivce {


    @Autowired
    private final SupplierRepo supplierRepo;

    @Autowired
    private final CinnamonRepo cinnamonRepo;

    @Autowired
    private final FarmerRepo farmerRepo;

    public FarmerServiceImpl(SupplierRepo supplierRepo, CinnamonRepo cinnamonRepo, FarmerRepo farmerRepo) {
        this.supplierRepo = supplierRepo;
        this.cinnamonRepo = cinnamonRepo;
        this.farmerRepo = farmerRepo;
    }


    @Override
    public List<ResponseSuppierDto> getSupplierDetails() {

        try{
            List<Supplier> result = supplierRepo.findAll();

            List<ResponseSuppierDto> responseSuppierDtos=result.stream().map(supplier -> {
                ResponseSuppierDto responseSuppierDto = new ResponseSuppierDto();
                responseSuppierDto.setSuplierId(supplier.getSuplierId());
                responseSuppierDto.setSuplierArea(supplier.getSuplierArea());
                responseSuppierDto.setCinnamonType(supplier.getCinnamonType());
                responseSuppierDto.setBuyPrice(supplier.getBuyPrice());
                return responseSuppierDto;
            }).collect(Collectors.toList());
            return responseSuppierDtos;

        }catch(Exception e){
            System.out.println(e);
            return null;
        }



    }

    @Override
    @Transactional
    public String addCinnamon(RequestCinnamonDto requestCinnamonDto , Long farmerId) {
        try{

            Farmer  farmer = farmerRepo
                    .findById(farmerId)
                    .orElseThrow(() -> new RuntimeException("Farmer not found with id: " + farmerId));

            Cinnamon cinnamon = new Cinnamon();
            cinnamon.setCinnamonType(requestCinnamonDto.getCinnamonType());
            cinnamon.setTitle(requestCinnamonDto.getTitle());
            cinnamon.setQuantity(requestCinnamonDto.getQuantity());
            cinnamon.setSellPrice(requestCinnamonDto.getSellPrice());
            cinnamon.setDescription(requestCinnamonDto.getDescription());

            System.out.println(farmer.getId());
            cinnamon.setFarmer(farmer);

            cinnamonRepo.save(cinnamon);
            return "Cinnamon Added";
        }catch(Exception e){
            System.out.println(e);
            return "Error";
        }
    }
}
