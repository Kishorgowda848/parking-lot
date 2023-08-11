package com.prakinglot.dto;

import com.prakinglot.enums.VehicleType;

public class TicketRequestDTO {

  private String vehicleNumber;

  private VehicleType vehicleType;

  private Long gateId;

  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public Long getGateId() {
    return gateId;
  }

  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public void setGateId(Long gateId) {
    this.gateId = gateId;
  }

}
