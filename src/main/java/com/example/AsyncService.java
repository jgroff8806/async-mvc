package com.example;

// Import necessary packages
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

// Service class to handle asynchronous tasks
@Service
public class AsyncService {

    // Method to simulate a long-running task
    @Async
    public CompletableFuture<String> fetchData() throws InterruptedException {
        // Simulate delay
        Thread.sleep(5000);
        // Return result as CompletableFuture
        return CompletableFuture.completedFuture("Data fetched from external API!");
    }
}