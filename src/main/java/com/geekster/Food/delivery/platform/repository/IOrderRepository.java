package com.geekster.Food.delivery.platform.repository;

import com.geekster.Food.delivery.platform.model.Order;
import com.geekster.Food.delivery.platform.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUsers(Users user);
}
