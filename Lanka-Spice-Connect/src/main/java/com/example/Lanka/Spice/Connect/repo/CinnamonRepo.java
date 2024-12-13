package com.example.Lanka.Spice.Connect.repo;


import com.example.Lanka.Spice.Connect.entity.Cinnamon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CinnamonRepo  extends JpaRepository<Cinnamon, Long> {
    List<Cinnamon> findAll();



}
