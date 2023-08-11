package com.prakinglot.model;

import java.util.List;

public class ParkingLot extends BaseModel {

  private List<Gate> gates;

  private List<Floar> foars;

  private int capacity;

  public List<Gate> getGates() {
    return gates;
  }

  public void setGates(List<Gate> gates) {
    this.gates = gates;
  }

  public List<Floar> getFoars() {
    return foars;
  }

  public void setFoars(List<Floar> foars) {
    this.foars = foars;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

}
