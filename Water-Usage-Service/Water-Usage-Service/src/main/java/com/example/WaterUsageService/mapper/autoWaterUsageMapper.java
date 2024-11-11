package com.example.WaterUsageService.mapper;

import com.example.WaterUsageService.dto.WaterUsageDto;
import com.example.WaterUsageService.entity.WaterUsage;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface autoWaterUsageMapper {
    autoWaterUsageMapper MAPPER = Mappers.getMapper(autoWaterUsageMapper.class);
    WaterUsage mapToWaterUsage(WaterUsageDto waterUsageDto);

    WaterUsageDto mapToWaterUsageDto(WaterUsage waterUsage);
}
