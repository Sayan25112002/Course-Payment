package com.payment.CoursePayment.mapper;

import com.payment.CoursePayment.dto.requestDto.PaymentDetailsRequestDto;
import com.payment.CoursePayment.dto.responseDto.PaymentDetailsResponseDto;
import com.payment.CoursePayment.entity.PaymentDetails;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentDetailsMapper {

    PaymentDetails toPaymentDetails(PaymentDetailsRequestDto paymentDetailsRequestDto);

    PaymentDetailsResponseDto toPaymentDetailsResponseDto(PaymentDetails paymentDetails);

    List<PaymentDetailsResponseDto> toPaymentDetailsResponseDtoList(List<PaymentDetails> paymentDetails);

}
