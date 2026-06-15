package com.sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sim.entity.Faculty;
import com.sim.repository.FacultyRepository;

@Service
public class FacultyService {

    private final FacultyRepository repository;

    public FacultyService(FacultyRepository repository) {
        this.repository = repository;
    }

    public Faculty save(Faculty faculty) {
        return repository.save(faculty);
    }

    public List<Faculty> getAll() {
        return repository.findAll();
    }

    public Faculty getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Faculty not found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}