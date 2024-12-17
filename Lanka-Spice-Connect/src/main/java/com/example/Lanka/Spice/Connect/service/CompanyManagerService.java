package com.example.Lanka.Spice.Connect.service;

import com.example.Lanka.Spice.Connect.dto.response.ResponseSalesRepresentativeDto;

import java.util.List;

public interface CompanyManagerService {
    List<ResponseSalesRepresentativeDto> getSalesRepresentativeDetails();

    String assignSalesRepresentative(Long id, Long salesRepId);
}
