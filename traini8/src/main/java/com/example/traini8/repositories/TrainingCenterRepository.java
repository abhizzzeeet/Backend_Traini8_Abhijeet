package com.example.traini8.repositories;


import com.example.traini8.models.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;

// Repository interface for TrainingCenter entity, providing CRUD operations
public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {}
