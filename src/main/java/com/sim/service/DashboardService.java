package com.sim.service;

import org.springframework.stereotype.Service;

import com.sim.dto.DashboardResponse;
import com.sim.repository.CourseRepository;
import com.sim.repository.DepartmentRepository;
import com.sim.repository.FacultyRepository;
import com.sim.repository.StudentRepository;

@Service
public class DashboardService {

    private final StudentRepository studentRepository;
    private final FacultyRepository facultyRepository;
    private final CourseRepository courseRepository;
    private final DepartmentRepository departmentRepository;

    public DashboardService(
            StudentRepository studentRepository,
            FacultyRepository facultyRepository,
            CourseRepository courseRepository,
            DepartmentRepository departmentRepository) {

        this.studentRepository = studentRepository;
        this.facultyRepository = facultyRepository;
        this.courseRepository = courseRepository;
        this.departmentRepository = departmentRepository;
    }

    public DashboardResponse getDashboard() {

        return new DashboardResponse(
                studentRepository.count(),
                facultyRepository.count(),
                courseRepository.count(),
                departmentRepository.count());
    }
}