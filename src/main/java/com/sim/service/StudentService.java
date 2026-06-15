package com.sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sim.entity.Student;
import com.sim.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}