package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.CompanyManager;
import com.example.Lanka.Spice.Connect.entity.SalesRepresentative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepresentativeRepo extends JpaRepository<SalesRepresentative, Long> {



}
