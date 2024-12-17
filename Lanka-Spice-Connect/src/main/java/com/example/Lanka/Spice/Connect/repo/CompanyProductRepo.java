package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.CompanyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyProductRepo extends JpaRepository<CompanyProduct, Long> {


}
