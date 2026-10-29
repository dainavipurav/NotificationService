package com.learning.springboot.notificationservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentEnrollmentNotificationDto {
    private String toEmail;
    private String emailTemplate;
    private String studentName;
    private String courseName;
    private LocalDate enrollmentDate;
    private String studentStatus;
}
