package com.day13.nsbm_student_hub.service;

import com.day13.nsbm_student_hub.entity.Student;
import com.day13.nsbm_student_hub.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public Page<Student> getStudents(int page, int size, String sortBy) {
        return repository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
    }

    public Student updateStudent(Long id, Student details) {
        Student s = repository.findById(id).orElseThrow();
        s.setName(details.getName());
        s.setGpa(details.getGpa());
        return repository.save(s);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}