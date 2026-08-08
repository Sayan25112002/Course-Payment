package com.payment.CoursePayment.controller;

import com.payment.CoursePayment.dto.requestDto.CourseDetailsRequestDto;
import com.payment.CoursePayment.dto.requestDto.PaymentDetailsRequestDto;
import com.payment.CoursePayment.dto.requestDto.StudentDetailRequestDto;
import com.payment.CoursePayment.dto.responseDto.CourseDetailsResponseDto;
import com.payment.CoursePayment.dto.responseDto.PaymentDetailsResponseDto;
import com.payment.CoursePayment.dto.responseDto.StudentDetailResponseDto;
import com.payment.CoursePayment.service.CoursePaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoursePaymentController {

    private final CoursePaymentService coursePaymentService;

    @PostMapping("/createStudentDetail")
    public StudentDetailResponseDto createStudentDetail(@RequestBody StudentDetailRequestDto studentDetailRequestDto) throws IOException {
        return coursePaymentService.saveStudentDetail(studentDetailRequestDto);
    }

    @GetMapping("/getStudentDetailById/{id}")
    public StudentDetailResponseDto getStudentDetailById(@PathVariable Long id) {
        return coursePaymentService.getStudentDetailById(id);
    }

    @GetMapping("/getAllStudentDetails")
    public List<StudentDetailResponseDto> getAllStudentDetails() {
        return coursePaymentService.getAllStudentDetails();
    }

    @PostMapping("/createCourseDetails/{id}")
    public CourseDetailsResponseDto createCourseDetails(@RequestBody CourseDetailsRequestDto courseDetailsRequestDto, @PathVariable Long id) {
        return coursePaymentService.saveCourseDetails(courseDetailsRequestDto, id);
    }

    @PostMapping("/createPaymentDetails/{id}")
    public PaymentDetailsResponseDto createPaymentDetails(@RequestBody PaymentDetailsRequestDto paymentDetailsRequestDto, @PathVariable Long id) {
        return coursePaymentService.createPaymentDetails(paymentDetailsRequestDto, id);
    }

}
