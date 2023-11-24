package com.practicejpa.spring.data.jpa.tutorial.repository;

import com.practicejpa.spring.data.jpa.tutorial.entity.Guardian;
import com.practicejpa.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private studentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("Akanksha.Baebade@gmail.com")
                .firstName("Akanksha")
                .lastName("Barbade")
                // .getGuardianName("Shaila")
                //  .guardianEmail("Shaila.barbade@gmail.com")
                // .guardianMobile("8765432100")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("Student List : " + studentList);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
                .name("ShailaBarbade")
                .email("Shaila1@gmail.com")
                .mobile("9876543210")
                .build();
        Student student = Student.builder()
                .emailId("Akanksha.Baebade2@gmail.com")
                .firstName("Apeksha")
                .lastName("Barbade")
                .guardian(guardian)
                .build();
        studentRepository.save(student);

    }
}