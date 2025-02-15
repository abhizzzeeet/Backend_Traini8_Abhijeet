package com.example.traini8.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    
    private String detailedAddress; // Optional
    
    @NotNull(message = "City cannot be null")
    @NotBlank(message = "City cannot be empty")
    private String city;
    
    @NotNull(message = "State cannot be null")
    @NotBlank(message = "State cannot be empty")
    private String state;
    
    @NotNull(message = "Pincode cannot be null")
    @NotBlank(message = "Pincode cannot be empty")
    private String pincode;
}
