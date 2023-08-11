package com.prakinglot.model;

import com.prakinglot.enums.GateStatus;
import com.prakinglot.enums.GateType;

public class Gate extends BaseModel {

  private String gateNumber;

  private Operator operator;

  private GateStatus status;

  private GateType type;
}
