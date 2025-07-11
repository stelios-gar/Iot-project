package com.example.iot.repository;

import com.example.iot.domain.TelemetryEntryEnergyConsumption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelemetryEntryEnergyConsumptionRepository extends JpaRepository<TelemetryEntryEnergyConsumption, Long> {
}
