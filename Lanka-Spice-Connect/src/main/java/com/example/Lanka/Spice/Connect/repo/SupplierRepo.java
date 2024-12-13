package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@EnableJpaRepositories
public interface SupplierRepo extends JpaRepository<Supplier, Long> {
    List<Supplier>findAll();
}