package com.payment.CoursePayment.dto.responseDto;

import com.payment.CoursePayment.entity.CourseDetails;
import com.payment.CoursePayment.entity.PaymentDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailResponseDto {

    private Long id;

    private String universityLogo;

    private String universityName;

    private String universityLocation;

    private String semesterName;

    private String name;

    private String registrationNumber;

    private String award;

    private String institute;

    private String photo;

    private List<CourseDetailsResponseDto> courseDetailsResponseDtos;

    private List<PaymentDetails> paymentDetails;

    private String signature;

}
