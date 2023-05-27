package com.kodlamaio.rentalservice.business.dto.requests;

import com.kodlamaio.commonpackage.utils.dto.PaymentRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalRequest {
    private UUID carId;
    private double dailyPrice;
    private int rentedForDays;
    private PaymentRequest paymentRequest;
}
