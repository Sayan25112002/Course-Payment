package com.payment.CoursePayment.dto.responseDto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDetailsResponseDto {

    private Long id;

    private String paymentDate;

    private String paymentId;

    private String orderId;

    private String amount;

    private String status;

    private StudentDetailResponseDto studentDetailResponseDto;

}
