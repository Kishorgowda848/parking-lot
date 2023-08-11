package com.prakinglot.model;

import com.prakinglot.enums.VehicleType;

public class Vehicle extends BaseModel {

  private String number;

  private VehicleType type;

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public VehicleType getType() {
    return type;
  }

  public void setType(VehicleType type) {
    this.type = type;
  }

}
