package com.sim.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.sim.entity.Course;
import com.sim.service.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping
    public Course save(
            @RequestBody Course course) {

        return service.save(course);
    }

    @GetMapping
    public List<Course> getAll() {
        return service.getAll();
    }
}