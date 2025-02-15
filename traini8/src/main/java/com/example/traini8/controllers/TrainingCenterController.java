package com.example.traini8.controllers;


import com.example.traini8.models.TrainingCenter;
import com.example.traini8.services.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {
    @Autowired
    private TrainingCenterService service;

    // Create a new training center
    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter center) {
        return ResponseEntity.ok(service.createTrainingCenter(center));
    }

    // Retrieve all training centers
    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }

    // Search training centers by query parameter
    @GetMapping("/search")
    public ResponseEntity<List<TrainingCenter>> searchTrainingCenters(@RequestParam String query) {
        return ResponseEntity.ok(service.searchTrainingCenters(query));
    }
}