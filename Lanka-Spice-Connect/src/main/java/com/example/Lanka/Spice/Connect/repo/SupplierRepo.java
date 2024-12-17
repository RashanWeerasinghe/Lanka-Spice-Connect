package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.SalesRepresentative;
import com.example.Lanka.Spice.Connect.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@EnableJpaRepositories
public interface SupplierRepo extends JpaRepository<Supplier, Long> {
    List<Supplier>findAll();

    @Modifying
    @Transactional
    @Query("update suplier s set s.quantity = ?2 where s.suplierId = ?1")
    void updateStock(Long supplierId, double quantity);



    @Modifying
    @Transactional
    @Query("update suplier s set s.salesrepresentative = ?2 where s.suplierId = ?1")
    void UpdateSalesRepresentative(Long supplierId, SalesRepresentative salesRepresentative);


}