package com.bangkitanom.sm3.fraud.repository;

import com.bangkitanom.sm3.fraud.model.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
