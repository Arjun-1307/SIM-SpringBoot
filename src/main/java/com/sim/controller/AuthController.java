package com.sim.controller;

import org.springframework.web.bind.annotation.*;

import com.sim.dto.LoginRequest;
import com.sim.dto.LoginResponse;
import com.sim.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    private final AuthService authService;

    public AuthController(
            AuthService authService) {

        this.authService = authService;
    }

    @PostMapping("/login")
    public LoginResponse login(
            @RequestBody
            LoginRequest request) {

        return authService.login(request);
    }
}