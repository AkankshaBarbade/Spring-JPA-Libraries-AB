package com.practicejpa.spring.data.jpa.tutorial.repository;

import com.practicejpa.spring.data.jpa.tutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<Student, Long> {

}
