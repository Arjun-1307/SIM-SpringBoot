package com.sim.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentDashboardController {

    @GetMapping("/dashboard")
    public Map<String,Object> dashboard() {

        Map<String,Object> map =
                new HashMap<>();

        map.put("message",
                "Student Dashboard");

        return map;
    }
}