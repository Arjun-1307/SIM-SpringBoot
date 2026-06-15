package com.sim.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sim.dto.DashboardResponse;
import com.sim.service.DashboardService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final DashboardService dashboardService;

    public AdminController(
            DashboardService dashboardService) {

        this.dashboardService = dashboardService;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/dashboard")
    public DashboardResponse dashboard() {

        return dashboardService.getDashboard();
    }
}