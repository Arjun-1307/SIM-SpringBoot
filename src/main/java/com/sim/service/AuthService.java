package com.sim.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sim.dto.LoginRequest;
import com.sim.dto.LoginResponse;
import com.sim.entity.User;
import com.sim.repository.UserRepository;
import com.sim.security.JwtService;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthService(
            UserRepository userRepository,
            JwtService jwtService,
            PasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
    }

    public LoginResponse login(LoginRequest request) {

        User user =
                userRepository.findByUsername(
                                request.getUsername())
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Invalid username"));

        if (!passwordEncoder.matches(
                request.getPassword(),
                user.getPassword())) {

            throw new RuntimeException(
                    "Invalid password");
        }

        String token =
                jwtService.generateToken(
                        user.getUsername());

        return new LoginResponse(
                token,
                user.getId(),
                user.getUsername(),
                user.getRole().name()
        );
    }
}