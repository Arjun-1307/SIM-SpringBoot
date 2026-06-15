package com.sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sim.entity.Course;
import com.sim.repository.CourseRepository;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public Course save(Course course) {
        return repository.save(course);
    }

    public List<Course> getAll() {
        return repository.findAll();
    }
}