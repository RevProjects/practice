package com.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration
public class TestcontainersConfiguration {

	@Value("${SPRING_DATASOURCE_URL}")
	private String dbURL;

	@Value("${SPRING_DATASOURCE_USERNAME}")
	private String dbUser;

	@Value("${SPRING_DATASOURCE_PASSWORD}")
	private String dbPassword;

	@Bean
	public PostgreSQLContainer<?> postgresContainer() {
		PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"))
				.withDatabaseName("postgres") // Use a fixed database name
				.withUsername(dbUser)
				.withPassword(dbPassword);

		// Start the container and set system properties so that Spring Boot picks them up
		postgres.start();
		System.setProperty("SPRING_DATASOURCE_URL", postgres.getJdbcUrl());
		System.setProperty("SPRING_DATASOURCE_USERNAME", postgres.getUsername());
		System.setProperty(("SPRING_DATASOURCE_PASSWORD"), postgres.getPassword());
		return postgres;
	}
}