package com.example.iot.service;

import com.example.iot.domain.TelemetryEntry;
import com.example.iot.repository.TelemetryEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelemetryEntryService {

    private final TelemetryEntryRepository repository;

    public TelemetryEntryService(TelemetryEntryRepository repository) {
        this.repository = repository;
    }

    public TelemetryEntry save(TelemetryEntry entry) {
        return repository.save(entry);
    }

    public List<TelemetryEntry> findAll() {
        return repository.findAll();
    }

    public TelemetryEntry findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
