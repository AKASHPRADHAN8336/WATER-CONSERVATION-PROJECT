package com.example.WaterUsageService.mapper;

import com.example.WaterUsageService.dto.WaterUsageDto;
import com.example.WaterUsageService.entity.WaterUsage;

public class WaterUsageMapper {
    public static WaterUsage mapToWaterUsage(WaterUsageDto waterUsageDto){
        WaterUsage waterusage = new WaterUsage(
                waterUsageDto.getId(),
                waterUsageDto.getUserId(),
                waterUsageDto.getAmount(),
                waterUsageDto.getTimestamp()
        );
        return waterusage;
    }

    public static WaterUsageDto mapToWaterUsageDto(WaterUsage waterusage){
        WaterUsageDto waterusagedto = new WaterUsageDto(
                waterusage.getId(),
                waterusage.getUserId(),
                waterusage.getAmount(),
                waterusage.getTimestamp()
        );

        return waterusagedto;
    }
}
