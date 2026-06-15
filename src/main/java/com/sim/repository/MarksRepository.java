package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sim.entity.Marks;

public interface MarksRepository
        extends JpaRepository<Marks, Long> {
}