package com.example.Lanka.Spice.Connect.repo;


import com.example.Lanka.Spice.Connect.entity.Cinnamon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinnamonRepo  extends JpaRepository<Cinnamon, Long> {
    List<Cinnamon> findAll();



}
