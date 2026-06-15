package com.sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sim.entity.Marks;
import com.sim.repository.MarksRepository;

@Service
public class MarksService {

    private final MarksRepository repository;

    public MarksService(MarksRepository repository) {
        this.repository = repository;
    }

    public Marks save(Marks marks) {

        double total =
                marks.getInternalMarks()
                + marks.getExternalMarks();

        marks.setTotalMarks(total);

        if(total >= 90)
            marks.setGrade("A+");
        else if(total >= 80)
            marks.setGrade("A");
        else if(total >= 70)
            marks.setGrade("B");
        else if(total >= 60)
            marks.setGrade("C");
        else
            marks.setGrade("F");

        return repository.save(marks);
    }

    public List<Marks> getAll() {
        return repository.findAll();
    }
}