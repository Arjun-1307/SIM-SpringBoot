package com.sim.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.sim.entity.Enrollment;
import com.sim.service.EnrollmentService;

@RestController
@RequestMapping("/api/enrollments")
public class EnrollmentController {

    private final EnrollmentService service;

    public EnrollmentController(
            EnrollmentService service) {

        this.service = service;
    }

    @PostMapping
    public Enrollment save(
            @RequestBody Enrollment enrollment) {

        return service.save(enrollment);
    }

    @GetMapping
    public List<Enrollment> getAll() {

        return service.getAll();
    }
}