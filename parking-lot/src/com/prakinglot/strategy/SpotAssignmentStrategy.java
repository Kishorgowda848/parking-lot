package com.prakinglot.strategy;

import java.util.Optional;

import com.prakinglot.enums.SpotStatus;
import com.prakinglot.enums.VehicleType;
import com.prakinglot.model.Floar;
import com.prakinglot.model.Gate;
import com.prakinglot.model.ParkingLot;
import com.prakinglot.model.ParkingSpot;

public class SpotAssignmentStrategy implements SpotAssignmentStrategyInterface {

  @Override
  public Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot, Gate gate) {

    for (Floar parkingFloar : parkingLot.getFoars()) {
      for (ParkingSpot parkingSpot : parkingFloar.getParkingSpot()) {
        if (parkingSpot.getSpotStatus().equals(SpotStatus.EMPTY)) {
          return Optional.of(parkingSpot);
        }
      }
    }
    return Optional.empty();
  }
}
