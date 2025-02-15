package com.example.traini8.repositories;


import com.example.traini8.models.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TrainingCenterRepository extends MongoRepository<TrainingCenter, String> {}
