package com.payment.CoursePayment.service.implementation;

import com.payment.CoursePayment.dto.requestDto.CourseDetailsRequestDto;
import com.payment.CoursePayment.dto.requestDto.PaymentDetailsRequestDto;
import com.payment.CoursePayment.dto.requestDto.StudentDetailRequestDto;
import com.payment.CoursePayment.dto.responseDto.CourseDetailsResponseDto;
import com.payment.CoursePayment.dto.responseDto.PaymentDetailsResponseDto;
import com.payment.CoursePayment.dto.responseDto.StudentDetailResponseDto;
import com.payment.CoursePayment.entity.CourseDetails;
import com.payment.CoursePayment.entity.PaymentDetails;
import com.payment.CoursePayment.entity.StudentDetail;
import com.payment.CoursePayment.mapper.CourseDetailsMapper;
import com.payment.CoursePayment.mapper.PaymentDetailsMapper;
import com.payment.CoursePayment.mapper.StudentDetailMapper;
import com.payment.CoursePayment.repository.CourseDetailsRepository;
import com.payment.CoursePayment.repository.PaymentDetailsRepository;
import com.payment.CoursePayment.repository.StudentDetailRepository;
import com.payment.CoursePayment.service.CoursePaymentService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CoursePaymentServiceImpl implements CoursePaymentService {

    private final StudentDetailRepository studentDetailRepository;
    private final CourseDetailsRepository courseDetailsRepository;
    private final PaymentDetailsRepository paymentDetailsRepository;
    private final CourseDetailsMapper courseDetailsMapper;
    private final StudentDetailMapper studentDetailsMapper;
    private final PaymentDetailsMapper paymentDetailsMapper;

    @Override
    public StudentDetailResponseDto saveStudentDetail(StudentDetailRequestDto studentDetailRequestDto) throws IOException {
        StudentDetail studentDetail = studentDetailsMapper.toStudentDetail(studentDetailRequestDto);
        studentDetail.setUniversityLogo(saveFile(studentDetailRequestDto.getUniversityLogoFile()));
        studentDetail.setPhoto(saveFile(studentDetailRequestDto.getPhotoFile()));
        studentDetail.setSignature(saveFile(studentDetailRequestDto.getSignatureFile()));
        StudentDetail savedStudentDetail = studentDetailRepository.save(studentDetail);
        return studentDetailsMapper.toStudentDetailResponseDto(savedStudentDetail);
    }

    @Override
    public StudentDetailResponseDto getStudentDetailById(Long id) {
        StudentDetail studentDetail = studentDetailRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Student Detail Not Found"));
        return studentDetailsMapper.toStudentDetailResponseDto(studentDetail);
    }

    @Override
    public List<StudentDetailResponseDto> getAllStudentDetails() {
        List<StudentDetail> studentDetails = studentDetailRepository.findAll();
        return studentDetailsMapper.toStudentDetailResponseDtoList(studentDetails);
    }

    @Override
    public CourseDetailsResponseDto saveCourseDetails(CourseDetailsRequestDto courseDetailsRequestDto, Long studentDetailId) {
        CourseDetails courseDetails = courseDetailsMapper.toCourseDetails(courseDetailsRequestDto);
        StudentDetail studentDetail = studentDetailRepository.findById(studentDetailId).orElseThrow(()-> new EntityNotFoundException("Student Detail Not Found"));
        courseDetails.setStudentDetail(studentDetail);
        studentDetail.getCourseDetails().add(courseDetails);
        CourseDetails savedCourseDetails = courseDetailsRepository.save(courseDetails);
        return courseDetailsMapper.toCourseDetailsResponseDto(savedCourseDetails);
    }

    @Override
    public PaymentDetailsResponseDto createPaymentDetails(PaymentDetailsRequestDto paymentDetailsRequestDto, Long studentDetailId) {
        PaymentDetails paymentDetails = paymentDetailsMapper.toPaymentDetails(paymentDetailsRequestDto);
        StudentDetail  studentDetail = studentDetailRepository.findById(studentDetailId).orElseThrow(()-> new EntityNotFoundException("Student Detail Not Found"));
        paymentDetails.setStudentDetail(studentDetail);
        studentDetail.getPaymentDetails().add(paymentDetails);
        PaymentDetails savedPaymentDetails = paymentDetailsRepository.save(paymentDetails);
        return paymentDetailsMapper.toPaymentDetailsResponseDto(savedPaymentDetails);
    }

    @Override
    public byte[] generateCoursePaymentSlip(Long id) {
        return new byte[0];
    }

    private String saveFile(MultipartFile file) throws IOException {
        String uploadDir = System.getProperty("user.dir")+"\\src\\main\\resources\\webapp\\images\\";
        Files.createDirectories(Paths.get(uploadDir));
        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
        Path path = Paths.get(uploadDir, fileName);
        Files.write(path, file.getBytes());
        return path.toString();
    }

}
