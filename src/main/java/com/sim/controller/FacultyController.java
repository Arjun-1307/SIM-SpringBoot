package com.sim.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.sim.entity.Faculty;
import com.sim.service.FacultyService;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

    private final FacultyService service;

    public FacultyController(FacultyService service) {
        this.service = service;
    }

    @PostMapping
    public Faculty save(
            @RequestBody Faculty faculty) {

        return service.save(faculty);
    }

    @GetMapping
    public List<Faculty> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Faculty getById(
            @PathVariable Long id) {

        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);
        return "Faculty deleted successfully";
    }
    @PreAuthorize("hasRole('FACULTY')")
    @GetMapping("/dashboard")
    public String dashboard() {
        return "Faculty Dashboard";
    }
}