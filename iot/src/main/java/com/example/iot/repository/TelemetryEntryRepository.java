package com.example.iot.repository;

import com.example.iot.domain.TelemetryEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelemetryEntryRepository extends JpaRepository<TelemetryEntry, Long> {
}
