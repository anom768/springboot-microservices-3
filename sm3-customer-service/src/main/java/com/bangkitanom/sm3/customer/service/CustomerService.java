package com.bangkitanom.sm3.customer.service;

import com.bangkitanom.sm3.customer.dto.CustomerRegistrationRequest;
import com.bangkitanom.sm3.customer.dto.FraudCheckResponse;
import com.bangkitanom.sm3.customer.model.Customer;
import com.bangkitanom.sm3.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    public void register(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();

        // todo: check if email valid
        // todo: check if email not taken
        // todo: store customer in db
        customerRepository.saveAndFlush(customer);

        // todo: check if fraudster
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://SM3-FRAUD-SERVICE/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );

        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }

        // todo: send notification
    }

}
