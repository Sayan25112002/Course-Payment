package com.payment.CoursePayment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentDate;

    private String paymentId;

    private String orderId;

    private String amount;

    private String status;

    @ManyToOne
    @JoinColumn(name="studentDetailId")
    @JsonIgnore
    private StudentDetail studentDetail;

}
