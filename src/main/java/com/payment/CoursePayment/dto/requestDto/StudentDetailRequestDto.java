package com.payment.CoursePayment.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailRequestDto {

    private String universityLogo;

    private String universityName;

    private String universityLocation;

    private String semesterName;

    private String name;

    private String registrationNumber;

    private String award;

    private String institute;

    private String photo;

    private String signature;

}
