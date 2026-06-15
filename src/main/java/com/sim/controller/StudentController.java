package com.sim.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sim.entity.Student;
import com.sim.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student create(
            @RequestBody Student student) {

        return service.save(student);
    }

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student getById(
            @PathVariable Long id) {

        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Student deleted successfully";
    }
    @PreAuthorize("hasRole('STUDENT')")
    @GetMapping("/dashboard")
    public String dashboard() {
        return "Student Dashboard";
    }
}