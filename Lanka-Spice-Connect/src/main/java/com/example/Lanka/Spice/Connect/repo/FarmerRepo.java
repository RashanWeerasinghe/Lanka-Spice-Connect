package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FarmerRepo extends JpaRepository<Farmer, Long> {
    List<Farmer> findAll();
}
