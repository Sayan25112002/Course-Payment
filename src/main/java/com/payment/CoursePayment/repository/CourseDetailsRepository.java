package com.payment.CoursePayment.repository;

import com.payment.CoursePayment.entity.CourseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDetailsRepository extends JpaRepository<CourseDetails, Long> {
}
