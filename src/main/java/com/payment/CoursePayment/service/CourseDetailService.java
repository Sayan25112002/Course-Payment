package com.payment.CoursePayment.service;

import com.payment.CoursePayment.dto.requestDto.CourseDetailsRequestDto;
import com.payment.CoursePayment.dto.responseDto.CourseDetailsResponseDto;

public interface CourseDetailService {

    CourseDetailsResponseDto saveCourseDetails(CourseDetailsRequestDto courseDetailsRequestDto);

}
