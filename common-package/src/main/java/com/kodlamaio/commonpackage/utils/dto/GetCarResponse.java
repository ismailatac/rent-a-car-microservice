package com.kodlamaio.commonpackage.utils.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCarResponse {
    private UUID id;
    private int modelYear;
    private String plate;
    private double dailyPrice;
    private String state;
    private UUID modelId;

}
