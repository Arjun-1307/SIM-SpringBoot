package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sim.entity.Attendance;

public interface AttendanceRepository
        extends JpaRepository<Attendance, Long> {
}