package com.learning.springboot.notificationservice.service;

import com.learning.springboot.notificationservice.dto.StudentEnrollmentNotificationDto;
import com.learning.springboot.notificationservice.dto.SuccessResponseDto;

public interface NotificationService {

    public SuccessResponseDto sendEmailNotification(StudentEnrollmentNotificationDto request);
}
