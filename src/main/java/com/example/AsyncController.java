package com.example;

// Import necessary packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

// Controller to handle incoming requests
@RestController
@RequestMapping("/api")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    // Endpoint to trigger the asynchronous task
    @GetMapping("/fetch-data")
    public CompletableFuture<String> fetchDataAsync() throws InterruptedException {
        // Call the asynchronous method from the service
        return asyncService.fetchData();
    }
}