package com.prakinglot.model;

public class Operator extends BaseModel {

  private String name;

  private Long employId;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getEmployId() {
    return employId;
  }

  public void setEmployId(Long employId) {
    this.employId = employId;
  }

}
