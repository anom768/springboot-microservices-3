package com.bangkitanom.sm3.customer.repository;

import com.bangkitanom.sm3.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
