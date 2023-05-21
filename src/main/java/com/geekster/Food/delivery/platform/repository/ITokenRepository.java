package com.geekster.Food.delivery.platform.repository;

import com.geekster.Food.delivery.platform.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITokenRepository extends JpaRepository<AuthenticationToken, Long> {
    AuthenticationToken findFirstByToken(String token);
}
