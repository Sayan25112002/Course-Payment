package com.payment.CoursePayment.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailRequestDto {

    private String universityLogo;

    private MultipartFile universityLogoFile;

    private String universityName;

    private String universityLocation;

    private String semesterName;

    private String name;

    private String registrationNumber;

    private String award;

    private String institute;

    private String photo;

    private MultipartFile photoFile;

    private String signature;

    private MultipartFile signatureFile;

}
