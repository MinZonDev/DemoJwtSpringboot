package com.example.demojwt.config;

import com.example.demojwt.models.ERole;
import com.example.demojwt.models.Role;
import com.example.demojwt.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        // Initialize roles if they don't exist
        if (roleRepository.count() == 0) {
            roleRepository.save(new Role(null, ERole.ROLE_USER));
            roleRepository.save(new Role(null, ERole.ROLE_MODERATOR));
            roleRepository.save(new Role(null, ERole.ROLE_ADMIN));
            
            System.out.println("Roles initialized successfully!");
        }
    }
}