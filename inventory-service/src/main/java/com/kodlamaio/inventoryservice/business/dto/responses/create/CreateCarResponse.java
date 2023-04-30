package com.kodlamaio.inventoryservice.business.dto.responses.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
//recordda kullanılır ama setter da sıkıntı çıkıyor
public class CreateCarResponse {
    private UUID id;
    private UUID modelId;

    private String modelYear;

    private String plate;

    private double dailyPrice;
}
