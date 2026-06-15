package com.sim.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.sim.entity.Marks;
import com.sim.service.MarksService;

@RestController
@RequestMapping("/api/marks")
public class MarksController {

    private final MarksService service;

    public MarksController(MarksService service) {
        this.service = service;
    }

    @PostMapping
    public Marks save(
            @RequestBody Marks marks) {

        return service.save(marks);
    }

    @GetMapping
    public List<Marks> getAll() {
        return service.getAll();
    }
}