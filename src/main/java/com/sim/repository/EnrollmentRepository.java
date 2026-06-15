package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sim.entity.Enrollment;

public interface EnrollmentRepository
        extends JpaRepository<Enrollment, Long> {
}