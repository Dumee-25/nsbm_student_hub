package com.day13.nsbm_student_hub.service;

import com.day13.nsbm_student_hub.entity.Student;
import com.day13.nsbm_student_hub.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // Create a new student record
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // Retrieve students with Pagination and Sorting
    public Page<Student> getStudents(int page, int size, String sortBy) {
        // PageRequest.of handles both requirements in a single call
        return repository.findAll(PageRequest.of(page, size, Sort.by(sortBy)));
    }

    // Update an existing student record
    public Student updateStudent(Long id, Student details) {
        // Find the student or throw an error if not found
        Student existingStudent = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        // Update all specific fields as required
        existingStudent.setName(details.getName());
        existingStudent.setBatch(details.getBatch());
        existingStudent.setGpa(details.getGpa());
        existingStudent.setEmail(details.getEmail());

        return repository.save(existingStudent);
    }

    // Delete a student by their ID
    public void deleteStudent(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Cannot delete: Student not found with id: " + id);
        }
        repository.deleteById(id);
    }
}