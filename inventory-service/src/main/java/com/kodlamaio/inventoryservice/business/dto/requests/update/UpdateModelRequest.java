package com.kodlamaio.inventoryservice.business.dto.requests.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
//recordda kullanılır ama setter da sıkıntı çıkıyor
public class UpdateModelRequest {
    @NotBlank //boşluk bırakırsa kabul etmemesi için
    @NotNull
    private UUID brandId;
    @NotBlank
    @Size(min = 2, max = 20)
    private String name;
}
