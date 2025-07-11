package com.example.iot.service;

import com.example.iot.domain.TelemetryEntryEnergyConsumption;
import com.example.iot.repository.TelemetryEntryEnergyConsumptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelemetryEntryEnergyConsumptionService {

    private final TelemetryEntryEnergyConsumptionRepository repository;

    public TelemetryEntryEnergyConsumptionService(TelemetryEntryEnergyConsumptionRepository repository) {
        this.repository = repository;
    }

    public TelemetryEntryEnergyConsumption save(TelemetryEntryEnergyConsumption entity) {
        return repository.save(entity);
    }

    public List<TelemetryEntryEnergyConsumption> findAll() {
        return repository.findAll();
    }

    public TelemetryEntryEnergyConsumption findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
