package com.sim.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.sim.entity.Department;
import com.sim.service.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(
            DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department save(
            @RequestBody Department department) {

        return service.save(department);
    }

    @GetMapping
    public List<Department> getAll() {

        return service.getAll();
    }
}