package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.EcommerceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EcommerceManagerRepo extends JpaRepository<EcommerceManager, Long> {

}
