package com.example.iot.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tlm_entries")
@Data
public class TelemetryEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double temperature;
    private Double humidity;
    private LocalDateTime timestamp;

    private String networkType;
    private Double batteryLevel;
}
