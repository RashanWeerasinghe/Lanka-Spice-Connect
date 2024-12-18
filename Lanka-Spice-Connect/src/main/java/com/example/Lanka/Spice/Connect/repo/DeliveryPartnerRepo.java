package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.DeliveryPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeliveryPartnerRepo extends JpaRepository<DeliveryPartner, Long> {

}
