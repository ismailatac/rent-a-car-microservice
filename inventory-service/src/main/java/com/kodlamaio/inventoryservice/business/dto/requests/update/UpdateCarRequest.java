package com.kodlamaio.inventoryservice.business.dto.requests.update;

import com.kodlamaio.inventoryservice.entities.enums.State;
import com.kodlamaio.inventoryservice.utils.constants.Regex;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
//recordda kullanılır ama setter da sıkıntı çıkıyor
public class UpdateCarRequest {
    @NotBlank //boşluk bırakırsa kabul etmemesi için
    @NotNull
    private UUID modelId;
    @Min(value = 2000)
    //TODO: Notfuture custom annotation
    private String modelYear;
    @NotNull
    @NotBlank
    //TODO: add regex
    @Pattern(regexp = Regex.Plate)
    private String plate;
    @NotNull
    @NotBlank
    private State state;
    @Min(value = 1)
    private double dailyPrice;
}
