package com.security.spring;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.security.spring.domain.AppUser;
import com.security.spring.domain.Role;
import com.security.spring.service.AppUserService;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(AppUserService appUserService) {

		return args -> {

			appUserService.saveUser(new AppUser(null, "Okky Septian", "08123", "okky123", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Ahmad Aunullah", "08456", "aan123", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Denta Dizon","08789", "denta123", new ArrayList<>()));
			appUserService.saveUser(new AppUser(null, "Jalaludin","08012", "jalal123", new ArrayList<>()));

			appUserService.saveRole(new Role(null, "ROLE_USER"));
			appUserService.saveRole(new Role(null, "ROLE_MANAGER"));
			appUserService.saveRole(new Role(null, "ROLE_ADMIN"));
			appUserService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			appUserService.addRoleToUser("08123", "ROLE_USER");
			appUserService.addRoleToUser("08456", "ROLE_MANAGER");
			appUserService.addRoleToUser("08789", "ROLE_ADMIN");
			appUserService.addRoleToUser("08012", "ROLE_SUPER_ADMIN");
		};
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
