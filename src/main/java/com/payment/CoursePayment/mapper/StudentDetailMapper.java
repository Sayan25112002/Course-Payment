package com.payment.CoursePayment.mapper;

import com.payment.CoursePayment.dto.requestDto.StudentDetailRequestDto;
import com.payment.CoursePayment.dto.responseDto.StudentDetailResponseDto;
import com.payment.CoursePayment.entity.StudentDetail;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentDetailMapper {

    StudentDetail toStudentDetail(StudentDetailRequestDto studentDetailRequestDto);

    StudentDetailResponseDto toStudentDetailResponseDto(StudentDetail studentDetail);

    List<StudentDetailResponseDto> toStudentDetailResponseDtoList(List<StudentDetail> studentDetails);

}
