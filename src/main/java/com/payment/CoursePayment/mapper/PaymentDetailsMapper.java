package com.payment.CoursePayment.mapper;

import com.payment.CoursePayment.dto.requestDto.PaymentDetailsRequestDto;
import com.payment.CoursePayment.dto.responseDto.PaymentDetailsResponseDto;
import com.payment.CoursePayment.entity.PaymentDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentDetailsMapper {

    PaymentDetails toPaymentDetails(PaymentDetailsRequestDto paymentDetailsRequestDto);

    @Mapping(source = "studentDetail", target = "studentDetailResponseDto")
    PaymentDetailsResponseDto toPaymentDetailsResponseDto(PaymentDetails paymentDetails);

    List<PaymentDetailsResponseDto> toPaymentDetailsResponseDtoList(List<PaymentDetails> paymentDetails);

}
