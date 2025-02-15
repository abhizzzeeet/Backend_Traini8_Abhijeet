package com.example.traini8.services;

import com.example.traini8.models.TrainingCenter;
import com.example.traini8.repositories.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainingCenterService {
    @Autowired
    private TrainingCenterRepository repository;
    
    // Saves a new training center to the database
    public TrainingCenter createTrainingCenter(TrainingCenter center) {
        return repository.save(center);
    }
    
    // Retrieves all training centers from the database
    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }

    // Searches training centers based on various attributes
    public List<TrainingCenter> searchTrainingCenters(String query) {
        List<TrainingCenter> allCenters = repository.findAll();
        
        return allCenters.stream()  // used stream operation to simplify filter code
                .filter(tc ->    // matching passed query with all attribute values of TrainingCenter object
                        tc.getCenterName().toLowerCase().contains(query.toLowerCase()) ||
                        tc.getCenterCode().toLowerCase().contains(query.toLowerCase()) ||
                        (tc.getAddress() != null && (
                            (tc.getAddress().getDetailedAddress() != null && tc.getAddress().getDetailedAddress().toLowerCase().contains(query.toLowerCase())) ||
                            (tc.getAddress().getCity() != null && tc.getAddress().getCity().toLowerCase().contains(query.toLowerCase())) ||
                            (tc.getAddress().getState() != null && tc.getAddress().getState().toLowerCase().contains(query.toLowerCase())) ||
                            (tc.getAddress().getPincode() != null && tc.getAddress().getPincode().contains(query))
                    )) ||
                        (tc.getCoursesOffered() != null && tc.getCoursesOffered().stream().anyMatch(course -> course.toLowerCase().contains(query.toLowerCase()))) ||
                        (tc.getContactEmail() != null && tc.getContactEmail().toLowerCase().contains(query.toLowerCase())) ||
                        (tc.getContactPhone() != null && tc.getContactPhone().contains(query))
                )
                .collect(Collectors.toList());
    }
}