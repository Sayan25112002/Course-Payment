package com.payment.CoursePayment.repository;

import com.payment.CoursePayment.entity.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetail, Long> {
}
