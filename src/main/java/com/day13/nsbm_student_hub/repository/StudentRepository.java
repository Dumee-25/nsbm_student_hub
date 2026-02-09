package com.day13.nsbm_student_hub.repository;

import com.day13.nsbm_student_hub.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}