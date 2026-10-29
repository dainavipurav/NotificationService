package com.learning.springboot.notificationservice.controller;

import com.learning.springboot.notificationservice.dto.StudentEnrollmentNotificationDto;
import com.learning.springboot.notificationservice.dto.SuccessResponseDto;
import com.learning.springboot.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("/notification/email")
    public SuccessResponseDto sendEmailNotification(@RequestBody StudentEnrollmentNotificationDto request){
        return notificationService.sendEmailNotification(request);
    }

}
