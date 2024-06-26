package com.bangkitanom.sm3.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        scanBasePackages = {
                "com.bangkitanom.sm3.customer",
                "com.bangkitanom.sm3.amqp"
        }
)
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.bangkitanom.sm3.clients")
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
