package com.kodlamaio.inventoryservice.business.dto.responses.get;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
//recordda kullanılır ama setter da sıkıntı çıkıyor
public class GetBrandResponse {
    private UUID id;
    private String name;
}
