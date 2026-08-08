package com.payment.CoursePayment.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDetailsRequestDto {

    private String paymentDate;

    private String paymentId;

    private String orderId;

    private String amount;

    private String status;

}
