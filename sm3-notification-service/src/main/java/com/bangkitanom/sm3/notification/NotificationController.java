package com.bangkitanom.sm3.notification;

import com.bangkitanom.sm3.clients.notification.NotificationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping
    public void send(@RequestBody NotificationRequest notificationRequest) {
        log.info("New notification... {}", notificationRequest);
        notificationService.send(notificationRequest);
    }

}
