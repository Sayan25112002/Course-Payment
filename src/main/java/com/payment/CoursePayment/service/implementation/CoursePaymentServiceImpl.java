package com.payment.CoursePayment.service.implementation;

import com.payment.CoursePayment.dto.requestDto.CourseDetailsRequestDto;
import com.payment.CoursePayment.dto.requestDto.PaymentDetailsRequestDto;
import com.payment.CoursePayment.dto.requestDto.StudentDetailRequestDto;
import com.payment.CoursePayment.dto.responseDto.CourseDetailsResponseDto;
import com.payment.CoursePayment.dto.responseDto.PaymentDetailsResponseDto;
import com.payment.CoursePayment.dto.responseDto.StudentDetailResponseDto;
import com.payment.CoursePayment.entity.StudentDetail;
import com.payment.CoursePayment.mapper.CourseDetailsMapper;
import com.payment.CoursePayment.mapper.PaymentDetailsMapper;
import com.payment.CoursePayment.mapper.StudentDetailMapper;
import com.payment.CoursePayment.repository.CourseDetailsRepository;
import com.payment.CoursePayment.repository.PaymentDetailsRepository;
import com.payment.CoursePayment.repository.StudentDetailRepository;
import com.payment.CoursePayment.service.CoursePaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoursePaymentServiceImpl implements CoursePaymentService {

    private final StudentDetailRepository studentDetailRepository;
    private final CourseDetailsRepository courseDetailsRepository;
    private final PaymentDetailsRepository paymentDetailsRepository;
    private final CourseDetailsMapper courseDetailsMapper;
    private final StudentDetailMapper studentDetailsMapper;
    private final PaymentDetailsMapper paymentDetailsMapper;

    @Override
    public StudentDetailResponseDto saveStudentDetail(StudentDetailRequestDto studentDetailRequestDto) {
        StudentDetail studentDetail = studentDetailsMapper.toStudentDetail(studentDetailRequestDto);
    }

    @Override
    public StudentDetailResponseDto getStudentDetailById(Long id) {
        return null;
    }

    @Override
    public List<StudentDetailResponseDto> getAllStudentDetails() {
        return List.of();
    }

    @Override
    public CourseDetailsResponseDto saveCourseDetails(CourseDetailsRequestDto courseDetailsRequestDto) {
        return null;
    }

    @Override
    public PaymentDetailsResponseDto createPaymentDetails(PaymentDetailsRequestDto paymentDetailsRequestDto) {
        return null;
    }
}
