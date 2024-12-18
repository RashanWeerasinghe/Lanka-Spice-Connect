package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo  extends JpaRepository<Customer, Long> {

}
