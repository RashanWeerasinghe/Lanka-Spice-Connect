package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.CinnamonandSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinnamonandSupplierRepo extends JpaRepository<CinnamonandSupplier, Long> {
    List<CinnamonandSupplier> findAll();
}
