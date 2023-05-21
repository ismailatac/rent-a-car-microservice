package com.kodlamaio.maintenanceservice.business.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateMaintenanceRequest {
    @NotNull
    private UUID carId;
    @NotBlank
    @Size(min = 2, max = 22222)
    private String information;
}


