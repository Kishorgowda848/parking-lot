package com.prakinglot.model;

import java.util.Date;

public class Ticket extends BaseModel {

  private ParkingSpot parkingSpot;

  private Date entryDate;

  private Vehicle vehicle;

  private Gate gate;

  private Operator operator;

  public ParkingSpot getParkingSpot() {
    return parkingSpot;
  }

  public void setParkingSpot(ParkingSpot parkingSpot) {
    this.parkingSpot = parkingSpot;
  }

  public Date getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(Date entryDate) {
    this.entryDate = entryDate;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Gate getGate() {
    return gate;
  }

  public void setGate(Gate gate) {
    this.gate = gate;
  }

  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    this.operator = operator;
  }
}
