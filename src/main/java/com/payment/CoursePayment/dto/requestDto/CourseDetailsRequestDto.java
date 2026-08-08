package com.payment.CoursePayment.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDetailsRequestDto {

    private String courseType;

    private String courseCode;

    private String courseName;

    private String academicEnrollmentFees;

    private String academicTotalFees;

    private String academicExaminationFees;

}
