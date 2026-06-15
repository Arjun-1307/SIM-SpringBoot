package com.sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sim.entity.Attendance;
import com.sim.repository.AttendanceRepository;

@Service
public class AttendanceService {

    private final AttendanceRepository repository;

    public AttendanceService(
            AttendanceRepository repository) {

        this.repository = repository;
    }

    public Attendance save(
            Attendance attendance) {

        return repository.save(attendance);
    }

    public List<Attendance> getAll() {
        return repository.findAll();
    }
}