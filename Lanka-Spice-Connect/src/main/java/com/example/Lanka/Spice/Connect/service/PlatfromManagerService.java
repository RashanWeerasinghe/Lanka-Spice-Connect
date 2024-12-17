package com.example.Lanka.Spice.Connect.service;

import com.example.Lanka.Spice.Connect.dto.response.ResponsePlatfromProductListDto;

import java.util.List;

public interface PlatfromManagerService {
    List<ResponsePlatfromProductListDto> getPlatfromProductList();
}
