package com.sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sim.entity.Enrollment;
import com.sim.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    private final EnrollmentRepository repository;

    public EnrollmentService(
            EnrollmentRepository repository) {

        this.repository = repository;
    }

    public Enrollment save(
            Enrollment enrollment) {

        return repository.save(enrollment);
    }

    public List<Enrollment> getAll() {
        return repository.findAll();
    }
}