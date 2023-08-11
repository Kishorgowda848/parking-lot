package com.prakinglot.model;

import java.time.LocalDateTime;
import java.util.List;

public class Bill extends BaseModel {

  private LocalDateTime time;

  private Ticket ticket;

  private Operator operator;

  private Long amount;

  private Gate gate;

  private List<Payment> payments;
}
