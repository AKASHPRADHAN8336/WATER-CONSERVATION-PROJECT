package com.example.WaterUsageService.controller;

import com.example.WaterUsageService.entity.WaterUsage;
import com.example.WaterUsageService.service.WaterUsageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/usage")
public class WaterUsageController {


    private WaterUsageService waterUsageService;

    public void logUsage(@RequestBody WaterUsage waterUsage){
        waterUsageService.logUsage(waterUsage);
    }

    @GetMapping("/user/{userId}")
    public List<WaterUsage> getUsageByUserId(@PathVariable Long userId){

        return waterUsageService.getUsageByUserId(userId);
    }
}
