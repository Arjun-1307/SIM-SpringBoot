package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sim.entity.Department;

public interface DepartmentRepository
        extends JpaRepository<Department, Long> {
}