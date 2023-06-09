package com.kodlamaio.inventoryservice.business.dto.responses.update;

import com.kodlamaio.inventoryservice.entities.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
//recordda kullanılır ama setter da sıkıntı çıkıyor
public class UpdateCarResponse {
    private UUID id;
    private UUID modelId;

    private String modelYear;

    private String plate;

    private State state;

    private double dailyPrice;
}
