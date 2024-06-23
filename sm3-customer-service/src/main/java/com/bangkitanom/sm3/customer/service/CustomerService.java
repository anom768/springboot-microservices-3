package com.bangkitanom.sm3.customer.service;

import com.bangkitanom.sm3.customer.dto.CustomerRegistrationRequest;
import com.bangkitanom.sm3.customer.model.Customer;
import com.bangkitanom.sm3.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void register(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();

        // todo: check if email valid
        // todo: check if email not taken
        // todo: store customer in db
        customerRepository.save(customer);
    }

}
