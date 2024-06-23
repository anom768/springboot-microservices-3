package com.bangkitanom.sm3.customer.controller;

import com.bangkitanom.sm3.customer.dto.CustomerRegistrationRequest;
import com.bangkitanom.sm3.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public void register(@RequestBody CustomerRegistrationRequest request) {
        customerService.register(request);
    }

}
