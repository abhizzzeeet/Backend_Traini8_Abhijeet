package com.example.traini8.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;

@Document(collection = "training_centers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenter {
    @Id
    private String id;
    
    @NotBlank
    @Size(max = 40)
    private String centerName;
    
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "CenterCode must be exactly 12 alphanumeric characters")
    private String centerCode;
    
    @NotNull
    @Valid
    private Address address;
    
    private int studentCapacity;
    private List<String> coursesOffered;
    
    private Instant createdOn = Instant.now();
    
    @Email
    private String contactEmail;
    
    @NotBlank
    @Pattern(regexp = "^\\d{10}$", message = "ContactPhone must be a valid 10-digit number")
    private String contactPhone;
}