package com.example.Lanka.Spice.Connect.service;

import com.example.Lanka.Spice.Connect.dto.request.RequestCinnamonDto;
import com.example.Lanka.Spice.Connect.dto.response.ResponseSuppierDto;

import java.util.List;

public interface FarmerSerivce {

    public List<ResponseSuppierDto> getSupplierDetails();

    String addCinnamon(RequestCinnamonDto requestCinnamonDto, Long farmerId);
}
