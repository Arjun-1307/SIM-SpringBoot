package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sim.entity.Student;

public interface StudentRepository
        extends JpaRepository<Student, Long> {

}