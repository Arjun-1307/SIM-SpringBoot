package com.sim.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sim.entity.Role;
import com.sim.entity.User;
import com.sim.repository.UserRepository;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(
            UserRepository repo,
            PasswordEncoder encoder) {

        return args -> {
            List<String> usernames = List.of("admin", "faculty1", "faculty2", "student1", "student2");
            
            for (String username : usernames) {
                if (repo.findByUsername(username).isEmpty()) {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(encoder.encode(username + "123"));
                    
                    if (username.equals("admin")) {
                        user.setRole(Role.ADMIN);
                    } else if (username.startsWith("faculty")) {
                        user.setRole(Role.FACULTY);
                    } else {
                        user.setRole(Role.STUDENT);
                    }
                    
                    repo.save(user);
                }
            }
        };
    }
}