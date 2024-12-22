package com.example.Lanka.Spice.Connect.repo;

import com.example.Lanka.Spice.Connect.entity.Orders_Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrderProductRepo extends JpaRepository<Orders_Product, Long> {

    @Modifying
    @Transactional
    @Query(value = "insert into orders_products (id,order_id, product_id) values (:id,:orderId, :productId)", nativeQuery = true)
    void saveOrder(Long id,Long orderId, Long productId);
}
