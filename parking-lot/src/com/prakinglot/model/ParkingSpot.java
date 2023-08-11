package com.prakinglot.model;

import java.util.List;

import com.prakinglot.enums.SpotStatus;
import com.prakinglot.enums.VehicleType;

public class ParkingSpot extends BaseModel {

  private String number;

  private List<VehicleType> vehicleTypes;

  private SpotStatus spotStatus;

  private Vehicle vehicle;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public List<VehicleType> getVehicleTypes() {
    return vehicleTypes;
  }

  public void setVehicleTypes(List<VehicleType> vehicleTypes) {
    this.vehicleTypes = vehicleTypes;
  }

  public SpotStatus getSpotStatus() {
    return spotStatus;
  }

  public void setSpotStatus(SpotStatus spotStatus) {
    this.spotStatus = spotStatus;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

}
