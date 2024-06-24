package com.bangkitanom.sm3.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
