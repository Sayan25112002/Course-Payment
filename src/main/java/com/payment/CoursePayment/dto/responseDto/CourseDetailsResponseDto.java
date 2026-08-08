package com.payment.CoursePayment.dto.responseDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.payment.CoursePayment.entity.StudentDetail;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDetailsResponseDto {

    private Long id;

    private String courseType;

    private String courseCode;

    private String courseName;

    private String academicEnrollmentFees;

    private String academicTotalFees;

    private String academicExaminationFees;

    private StudentDetailResponseDto studentDetailResponseDto;

}
