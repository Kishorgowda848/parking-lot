package com.prakinglot.repository;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import com.prakinglot.model.Gate;
import com.prakinglot.model.ParkingLot;

public class ParkingLotRepository {

  private Map<Long, ParkingLot> parkingLots = new TreeMap<>();

  public Optional<ParkingLot> findByGate(Gate gate) {

    for (ParkingLot parkingLot : parkingLots.values()) {
      if (parkingLot.getGates().contains(gate)) {
        return Optional.of(parkingLot);
      }
    }
    return Optional.empty();
  }

}
