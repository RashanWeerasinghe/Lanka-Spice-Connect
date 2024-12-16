package com.example.Lanka.Spice.Connect.service;

import com.example.Lanka.Spice.Connect.dto.request.RequestSupplierBidDto;

public interface SupplierService {

    String bidForCinnamon(RequestSupplierBidDto requestSupplierBidDto);

    String UpdateSupplierCinnamonStock(RequestSupplierBidDto requestSupplierBidDto);
}
