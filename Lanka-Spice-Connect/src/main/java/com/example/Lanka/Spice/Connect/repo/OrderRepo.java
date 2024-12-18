package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, Long> {

}
