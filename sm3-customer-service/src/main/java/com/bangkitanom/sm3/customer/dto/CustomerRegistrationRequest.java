package com.bangkitanom.sm3.customer.dto;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
