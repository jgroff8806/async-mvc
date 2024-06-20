package com.example;

// Import necessary Spring Boot classes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main application class annotated with @SpringBootApplication
// This annotation is a combination of @Configuration, @EnableAutoConfiguration, and @ComponentScan
@SpringBootApplication
public class AsyncMvcApplication {

    // The main method serves as the entry point for the Spring Boot application
    public static void main(String[] args) {
        // SpringApplication.run() bootstraps the application, starting the Spring context
        // and the embedded server (e.g., Tomcat) by default
        SpringApplication.run(AsyncMvcApplication.class, args);
    }
}