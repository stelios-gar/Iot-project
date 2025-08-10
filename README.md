# Iot-project
A web application written in Java and typescript.
Database : Postgre SQL
./mvnw clean install
./mvnw spring-boot:run

TelemetryEntryEnergyConsumption entity annotation explanation

TelemetryEntryEnergyConsumption row is linked to exactly one TelemetryEntry row via the tlm_entries_id column, and that relationship is unique in both directions.

### Example in Java

```java
// Create TelemetryEntry
TelemetryEntry entry = new TelemetryEntry();
entry.setTemperature(23.5);
entry.setHumidity(40.0);
entry.setTimestamp(LocalDateTime.now());
telemetryEntryRepository.save(entry);

// Create linked EnergyConsumption
TelemetryEntryEnergyConsumption energy = new TelemetryEntryEnergyConsumption();
energy.setEnergyConsumption(1.23);
energy.setDeviceId("ESP32-01");
energy.setExternalId(UUID.randomUUID().toString());
energy.setTelemetryEntry(entry); // link to entry

energyRepo.save(energy);
```