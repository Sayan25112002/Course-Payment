package com.payment.CoursePayment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class StudentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String universityLogo;

    private String universityName;

    private String universityLocation;

    private String semesterName;

    private String name;

    private String registrationNumber;

    private String award;

    private String institute;

    private String photo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentDetail")
    @JsonIgnore
    private List<CourseDetails> courseDetails;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentDetail")
    @JsonIgnore
    private List<PaymentDetails> paymentDetails;

    private String signature;

}
