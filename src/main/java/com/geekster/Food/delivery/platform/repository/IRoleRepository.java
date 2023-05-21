package com.geekster.Food.delivery.platform.repository;

import com.geekster.Food.delivery.platform.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
