package com.sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sim.entity.Department;
import com.sim.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(
            DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department save(Department department) {
        return repository.save(department);
    }

    public List<Department> getAll() {
        return repository.findAll();
    }
}