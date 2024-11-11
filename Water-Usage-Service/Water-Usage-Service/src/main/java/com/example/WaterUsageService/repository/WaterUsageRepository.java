package com.example.WaterUsageService.repository;

import com.example.WaterUsageService.entity.WaterUsage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WaterUsageRepository extends JpaRepository<WaterUsage , Long> {

    WaterUsage findByUserId(Long userId);

}
