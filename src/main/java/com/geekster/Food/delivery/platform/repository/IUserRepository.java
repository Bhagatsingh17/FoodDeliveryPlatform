package com.geekster.Food.delivery.platform.repository;

import com.geekster.Food.delivery.platform.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
    Users findFirstByEmail(String email);
}
