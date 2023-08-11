package com.prakinglot.dto;

public class TicketResponseDTO {

  private Long ticketId;

  private String operatorName;

  private String spotNumber;

  public Long getTicketId() {
    return ticketId;
  }

  public void setTicketId(Long ticketId) {
    this.ticketId = ticketId;
  }

  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }

  public String getSpotNumber() {
    return spotNumber;
  }

  public void setSpotNumber(String spotNumber) {
    this.spotNumber = spotNumber;
  }

}
