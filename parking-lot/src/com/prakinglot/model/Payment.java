package com.prakinglot.model;

import java.time.LocalDateTime;

import com.prakinglot.enums.PaymentMode;
import com.prakinglot.enums.PaymentStatus;

public class Payment extends BaseModel {

  private PaymentMode mode;

  private Long amount;

  private PaymentStatus status;

  private String refrenceId;

  private Bill bill;

  private LocalDateTime time;

}
