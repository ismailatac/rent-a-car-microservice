package com.kodlamaio.inventoryservice.business.dto.requests.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//recordda kullanılır ama setter da sıkıntı çıkıyor
public class CreateBrandRequest {
    @NotBlank
    @Size(min = 2, max = 20) //not null a gerek kalmıyor
    private String name;
}
