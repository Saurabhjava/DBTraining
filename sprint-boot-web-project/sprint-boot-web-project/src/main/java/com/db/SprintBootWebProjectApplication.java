package com.db;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SprintBootWebProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootWebProjectApplication.class, args);
	}

}
