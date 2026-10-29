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
public class StudentEnrollmentDetailsDto {
    private String studentName;
    private String courseName;
    private LocalDate registrationDate;
    private String studentStatus;
}
