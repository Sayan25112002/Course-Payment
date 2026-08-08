package com.payment.CoursePayment.service;

import com.payment.CoursePayment.dto.requestDto.StudentDetailRequestDto;
import com.payment.CoursePayment.dto.responseDto.StudentDetailResponseDto;

import java.util.List;

public interface StudentDetailService {

    StudentDetailResponseDto saveStudentDetail(StudentDetailRequestDto studentDetailRequestDto);

    StudentDetailResponseDto getStudentDetailById(Long id);

    List<StudentDetailResponseDto> getAllStudentDetails();

}
