package com.example.iot.service.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;


public record TelemetryEntryDTOForUI(
        @NotNull Double temperature,
        @NotNull Double humidity,
        @NotNull LocalDateTime timestamp,
        @NotNull String networkType,
        @NotNull @PositiveOrZero Double batteryLevel,
        @NotNull @PositiveOrZero Double energyConsumption
) {}