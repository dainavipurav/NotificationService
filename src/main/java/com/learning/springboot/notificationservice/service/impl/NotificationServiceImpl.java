package com.learning.springboot.notificationservice.service.impl;

import com.learning.springboot.notificationservice.dto.StudentEnrollmentNotificationDto;
import com.learning.springboot.notificationservice.dto.SuccessResponseDto;
import com.learning.springboot.notificationservice.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final RestClient restClient;

    @Override
    public SuccessResponseDto sendEmailNotification(StudentEnrollmentNotificationDto request) {
        return restClient.post()
                .uri(uriBuilder -> uriBuilder
                        .scheme("http")
                        .host("localhost")
                        .port(8081)
                        .path("/api/templateEmail")
                        .queryParam("to", request.getToEmail())
                        .queryParam("emailTemplate", request.getEmailTemplate())
                        .build())
                .body(Map.of(
                        "studentName", request.getStudentName(),
                        "courseName", request.getCourseName(),
                        "registrationDate", request.getEnrollmentDate(),
                        "studentStatus", request.getStudentStatus()
                ))
                .retrieve()
                .body(SuccessResponseDto.class);
    }
}
