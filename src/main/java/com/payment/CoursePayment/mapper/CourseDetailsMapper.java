package com.payment.CoursePayment.mapper;

import com.payment.CoursePayment.dto.requestDto.CourseDetailsRequestDto;
import com.payment.CoursePayment.dto.responseDto.CourseDetailsResponseDto;
import com.payment.CoursePayment.entity.CourseDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseDetailsMapper {

    CourseDetails toCourseDetails(CourseDetailsRequestDto courseDetailsRequestDto);

    @Mapping(source = "studentDetail", target = "studentDetailResponseDto")
    CourseDetailsResponseDto toCourseDetailsResponseDto(CourseDetails courseDetails);

    List<CourseDetailsResponseDto> toCourseDetailsResponseDtoList(List<CourseDetails> courseDetails);

}
