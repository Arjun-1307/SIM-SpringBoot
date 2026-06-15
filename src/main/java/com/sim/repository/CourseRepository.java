package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sim.entity.Course;

public interface CourseRepository
        extends JpaRepository<Course, Long> {

}