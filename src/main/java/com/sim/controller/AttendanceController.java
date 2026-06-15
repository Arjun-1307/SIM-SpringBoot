package com.sim.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.sim.entity.Attendance;
import com.sim.service.AttendanceService;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    private final AttendanceService service;

    public AttendanceController(
            AttendanceService service) {

        this.service = service;
    }

    @PostMapping
    public Attendance save(
            @RequestBody Attendance attendance) {

        return service.save(attendance);
    }

    @GetMapping
    public List<Attendance> getAll() {

        return service.getAll();
    }
}