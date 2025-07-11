package com.example.iot.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tlm_entries_nrg_consmp")
@Data
public class TelemetryEntryEnergyConsumption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double energyConsumption;

    @OneToOne
    @JoinColumn(name = "tlm_entries_id", referencedColumnName = "id", unique = true)
    private TelemetryEntry telemetryEntry;
}
