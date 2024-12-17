package com.example.Lanka.Spice.Connect.service.impl;

import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromProductListDto;
import com.example.Lanka.Spice.Connect.repo.CompanyProductRepo;
import com.example.Lanka.Spice.Connect.service.PlatfromManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PlatfromManagerServiceImpl implements PlatfromManagerService {

    @Autowired
    private final CompanyProductRepo companyProductRepo;

    public PlatfromManagerServiceImpl(CompanyProductRepo companyProductRepo) {
        this.companyProductRepo = companyProductRepo;
    }

    @Override
    public List<ResponsePlatfromProductListDto> getPlatfromProductList() {
        List<ResponsePlatfromProductListDto>result=companyProductRepo.findAll().stream().map(companyProduct -> {
            ResponsePlatfromProductListDto responsePlatfromProductListDto = new ResponsePlatfromProductListDto();
            responsePlatfromProductListDto.setId(companyProduct.getId());
            responsePlatfromProductListDto.setProductName(companyProduct.getProductName());
            responsePlatfromProductListDto.setProductType(companyProduct.getProductType());
            responsePlatfromProductListDto.setCompanyPrice(companyProduct.getCompanyPrice());
            return responsePlatfromProductListDto;
        }).collect(Collectors.toList());
        return result;
    }
}
