package com.kodlamaio.rentalservice.business.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRentalRequest {
    private UUID carId;
    private double dailyPrice;
    private double totalPrice;
    private int rentedForDays;
    private LocalDate rentedAt;
}
