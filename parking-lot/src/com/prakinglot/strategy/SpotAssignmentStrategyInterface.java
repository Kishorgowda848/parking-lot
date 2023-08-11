package com.prakinglot.strategy;

import java.util.Optional;

import com.prakinglot.enums.VehicleType;
import com.prakinglot.model.Gate;
import com.prakinglot.model.ParkingLot;
import com.prakinglot.model.ParkingSpot;

public interface SpotAssignmentStrategyInterface {
  Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot, Gate gate);
}
