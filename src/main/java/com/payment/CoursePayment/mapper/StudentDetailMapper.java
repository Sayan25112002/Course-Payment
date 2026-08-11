package com.payment.CoursePayment.mapper;

import com.payment.CoursePayment.dto.requestDto.StudentDetailRequestDto;
import com.payment.CoursePayment.dto.responseDto.StudentDetailResponseDto;
import com.payment.CoursePayment.entity.StudentDetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentDetailMapper {

    StudentDetail toStudentDetail(StudentDetailRequestDto studentDetailRequestDto);

    @Mapping(source = "courseDetails", target = "courseDetailsResponseDtos")
    @Mapping(source = "paymentDetails", target = "paymentDetailsResponseDtos")
    StudentDetailResponseDto toStudentDetailResponseDto(StudentDetail studentDetail);

    @Mapping(source = "courseDetails", target = "courseDetailsResponseDtos")
    @Mapping(source = "paymentDetails", target = "paymentDetailsResponseDtos")
    List<StudentDetailResponseDto> toStudentDetailResponseDtoList(List<StudentDetail> studentDetails);

}
