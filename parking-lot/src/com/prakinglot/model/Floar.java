package com.prakinglot.model;

import java.util.List;

public class Floar extends BaseModel {

  private List<ParkingSpot> parkingSpot;

  public List<ParkingSpot> getParkingSpot() {
    return parkingSpot;
  }

  public void setParkingSpot(List<ParkingSpot> parkingSpot) {
    this.parkingSpot = parkingSpot;
  }

}
