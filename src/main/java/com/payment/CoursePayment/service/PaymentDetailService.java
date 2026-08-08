package com.payment.CoursePayment.service;

import com.payment.CoursePayment.dto.requestDto.PaymentDetailsRequestDto;
import com.payment.CoursePayment.dto.responseDto.PaymentDetailsResponseDto;

public interface PaymentDetailService {

    PaymentDetailsResponseDto createPaymentDetails(PaymentDetailsRequestDto paymentDetailsRequestDto);

}
