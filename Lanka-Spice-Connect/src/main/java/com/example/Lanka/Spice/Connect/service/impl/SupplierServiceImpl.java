package com.example.Lanka.Spice.Connect.service.impl;
import com.example.Lanka.Spice.Connect.dto.request.RequestSupplierBidDto;
import com.example.Lanka.Spice.Connect.entity.Cinnamon;
import com.example.Lanka.Spice.Connect.entity.CinnamonandSupplier;
import com.example.Lanka.Spice.Connect.entity.Supplier;
import com.example.Lanka.Spice.Connect.repo.CinnamonRepo;
import com.example.Lanka.Spice.Connect.repo.CinnamonandSupplierRepo;
import com.example.Lanka.Spice.Connect.repo.SupplierRepo;
import com.example.Lanka.Spice.Connect.service.SupplierService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepo supplierRepo;

    private final CinnamonRepo cinnamonRepo;

    private final CinnamonandSupplierRepo cinnamonandSupplierRepo;

    public SupplierServiceImpl(SupplierRepo supplierRepo, CinnamonRepo cinnamonRepo, CinnamonandSupplierRepo cinnamonandSupplierRepo) {
        this.supplierRepo = supplierRepo;
        this.cinnamonRepo = cinnamonRepo;
        this.cinnamonandSupplierRepo = cinnamonandSupplierRepo;
    }

    @Override
    @Transactional
    public String bidForCinnamon(RequestSupplierBidDto requestSupplierBidDto) {
        try {
            Supplier supplier = supplierRepo.findById(requestSupplierBidDto.getSupplierId()).get();
            Cinnamon cinnamon = cinnamonRepo.findById(requestSupplierBidDto.getCinnamonId()).get();



            cinnamonandSupplierRepo
                    .save(
                            new CinnamonandSupplier(
                                    supplier,
                                    cinnamon,
                                    requestSupplierBidDto.getBidprice(),
                                    requestSupplierBidDto.getQuantity()
                            )
                    );
            return "Sucessfully Bidded";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to Bid";
        }

    }

    @Override
    public String UpdateSupplierCinnamonStock(RequestSupplierBidDto requestSupplierBidDto) {

        try {
            supplierRepo
                    .updateStock(
                            requestSupplierBidDto.getSupplierId(),
                            requestSupplierBidDto.getQuantity()
                    );
          return "Stock Updated";
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}