package com.bangkitanom.sm3.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("sm3-notification-service")
public interface NotificationClient {

    @PostMapping("/api/v1/notification")
    NotificationRequest send(@RequestBody NotificationRequest notificationRequest);

}
