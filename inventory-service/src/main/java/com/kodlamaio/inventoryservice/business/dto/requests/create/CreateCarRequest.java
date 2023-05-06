package com.kodlamaio.inventoryservice.business.dto.requests.create;

import com.kodlamaio.inventoryservice.entities.enums.State;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
//recordda kullanılır ama setter da sıkıntı çıkıyor
public class CreateCarRequest {
    //@NotBlank //boşluk bırakırsa kabul etmemesi için
    @NotNull
    private UUID modelId;
    @Min(value = 2000)
    //TODO: Notfuture custom annotation
    private String modelYear;
    @NotNull
    @NotBlank
    private String plate;

    @Min(value = 1)
    private double dailyPrice;
}
