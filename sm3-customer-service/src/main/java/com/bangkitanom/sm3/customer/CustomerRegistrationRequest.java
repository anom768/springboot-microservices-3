package com.bangkitanom.sm3.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
