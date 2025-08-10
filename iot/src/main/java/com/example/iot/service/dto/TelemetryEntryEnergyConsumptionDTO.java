package com.example.iot.service.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class TelemetryEntryEnergyConsumptionDTO {

    @NotNull Long id;
    @NotNull String externalId;
    @NotNull @PositiveOrZero Double energyConsumption;
}
