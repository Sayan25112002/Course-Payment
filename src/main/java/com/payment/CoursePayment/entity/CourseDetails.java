package com.payment.CoursePayment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CourseDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseType;

    private String courseCode;

    private String courseName;

    private String academicEnrollmentFees;

    private String academicTotalFees;

    private String academicExaminationFees;

    @ManyToOne
    @JoinColumn(name="studentDetailId")
    @JsonIgnore
    private StudentDetail studentDetail;

}
