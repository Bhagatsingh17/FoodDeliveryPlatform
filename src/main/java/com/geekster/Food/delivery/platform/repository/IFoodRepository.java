package com.geekster.Food.delivery.platform.repository;

import com.geekster.Food.delivery.platform.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFoodRepository extends JpaRepository<Food,Long> {

    List<Food> findByFoodName(String foodName);
}
