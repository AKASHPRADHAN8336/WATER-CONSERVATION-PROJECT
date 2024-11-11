package com.example.WaterUsageService.service;

import com.example.WaterUsageService.entity.WaterUsage;
import com.example.WaterUsageService.repository.WaterUsageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WaterUsageService {

    private WaterUsageRepository waterUsageRepository;


    public void logUsage(WaterUsage waterUsage){
        waterUsageRepository.save(waterUsage);

    }

    public List<WaterUsage> getUsageByUserId(Long userId){
        return (List<WaterUsage>) waterUsageRepository.findByUserId(userId);
    }
}
