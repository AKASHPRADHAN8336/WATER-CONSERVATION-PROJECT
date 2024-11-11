package com.example.WaterUsageService.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WaterUsageDto {

    private Long id;
    @NotEmpty(message = "your userId cannot be null or empty.")
    @Schema(
            description = "userId"
    )
    private Long userId;
    @NotEmpty(message = "your amount of water used.")
    @Schema(
            description = "amount"
    )
    private double amount;
    @NotEmpty(message = "Your time Stamp cannot be empty")
    @Schema(
            description = "timeStamp"
    )
    private String timestamp;
}
