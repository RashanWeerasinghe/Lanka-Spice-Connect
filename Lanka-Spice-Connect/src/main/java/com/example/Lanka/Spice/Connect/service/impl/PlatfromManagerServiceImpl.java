package com.example.Lanka.Spice.Connect.service.impl;

import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromManagerOrdersDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromProductListDto;
import com.example.Lanka.Spice.Connect.entity.CompanyProduct;
import com.example.Lanka.Spice.Connect.entity.EcommerceManager;
import com.example.Lanka.Spice.Connect.repo.CompanyProductRepo;
import com.example.Lanka.Spice.Connect.repo.EcommerceManagerRepo;
import com.example.Lanka.Spice.Connect.repo.OrderRepo;
import com.example.Lanka.Spice.Connect.service.PlatfromManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PlatfromManagerServiceImpl implements PlatfromManagerService {

    @Autowired
    private final CompanyProductRepo companyProductRepo;

    @Autowired
    private final EcommerceManagerRepo ecommerceManagerRepo;


    @Autowired
    private final OrderRepo orderRepo;

    public PlatfromManagerServiceImpl(CompanyProductRepo companyProductRepo, EcommerceManagerRepo ecommerceManagerRepo, OrderRepo orderRepo) {
        this.companyProductRepo = companyProductRepo;
        this.ecommerceManagerRepo = ecommerceManagerRepo;
        this.orderRepo = orderRepo;
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



    @Transactional
    @Override
    public String addProduct(ResponsePlatfromProductListDto responsePlatfromProductListDto, Long platfromId) {
        try{
            EcommerceManager ecommerceManager = ecommerceManagerRepo.findById(platfromId).get();

            companyProductRepo.save(
                    new CompanyProduct(
                            responsePlatfromProductListDto.getId(),
                            responsePlatfromProductListDto.getProductName(),
                            responsePlatfromProductListDto.getProductType(),
                            responsePlatfromProductListDto.getCompanyPrice(),
                            ecommerceManager
                    )
            );
            return "Product Added";
        }catch (Exception e){
            e.printStackTrace();
            return "Product Not Added";
        }
    }

    @Override
    public List<ResponsePlatfromManagerOrdersDto> getPlatfromOrdersList() {

        List<ResponsePlatfromManagerOrdersDto> result = orderRepo.findAll().stream().map(orders -> {
            ResponsePlatfromManagerOrdersDto responsePlatfromManagerOrdersDto = new ResponsePlatfromManagerOrdersDto();
            responsePlatfromManagerOrdersDto.setOrderId(orders.getId());
            responsePlatfromManagerOrdersDto.setTotalAmount(orders.getTotal());
            responsePlatfromManagerOrdersDto.setShippingAddress(orders.getShippingAddress());;
            return responsePlatfromManagerOrdersDto;
        }).collect(Collectors.toList());
        return result;
    }

    @Override
    public String assignOrderToDeliveryBoy(Long orderId, Long deliveryBoyId) {
        return null;
    }
}
