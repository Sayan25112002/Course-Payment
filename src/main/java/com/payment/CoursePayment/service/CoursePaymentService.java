package com.payment.CoursePayment.service;

import com.payment.CoursePayment.dto.requestDto.CourseDetailsRequestDto;
import com.payment.CoursePayment.dto.requestDto.PaymentDetailsRequestDto;
import com.payment.CoursePayment.dto.requestDto.StudentDetailRequestDto;
import com.payment.CoursePayment.dto.responseDto.CourseDetailsResponseDto;
import com.payment.CoursePayment.dto.responseDto.PaymentDetailsResponseDto;
import com.payment.CoursePayment.dto.responseDto.StudentDetailResponseDto;

import java.io.IOException;
import java.util.List;

public interface CoursePaymentService {

    StudentDetailResponseDto saveStudentDetail(StudentDetailRequestDto studentDetailRequestDto) throws IOException;

    StudentDetailResponseDto getStudentDetailById(Long id);

    List<StudentDetailResponseDto> getAllStudentDetails();

    CourseDetailsResponseDto saveCourseDetails(CourseDetailsRequestDto courseDetailsRequestDto, Long studentDetailId);

    PaymentDetailsResponseDto createPaymentDetails(PaymentDetailsRequestDto paymentDetailsRequestDto, Long studentDetailId);

}
