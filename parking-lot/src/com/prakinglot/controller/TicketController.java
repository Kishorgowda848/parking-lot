package com.prakinglot.controller;

import com.prakinglot.dto.TicketRequestDTO;
import com.prakinglot.dto.TicketResponseDTO;
import com.prakinglot.enums.VehicleType;
import com.prakinglot.exception.InvalidGateException;
import com.prakinglot.exception.NoAvailableParkingSpotException;
import com.prakinglot.model.Ticket;
import com.prakinglot.service.TicketService;

public class TicketController {

  private TicketService ticketService;

  public TicketController(TicketService ticketService) {
    this.ticketService = ticketService;
  }

  public TicketResponseDTO generateTicket(TicketRequestDTO request)
      throws InvalidGateException, NoAvailableParkingSpotException {
    String vehicleNumber = request.getVehicleNumber();
    VehicleType vehicleType = request.getVehicleType();
    Long gateId = request.getGateId();
    Ticket ticket = ticketService.generateTicket(vehicleNumber, vehicleType, gateId);

    TicketResponseDTO ticketReponse = new TicketResponseDTO();
    ticketReponse.setTicketId(ticket.getId());
    ticketReponse.setSpotNumber(ticket.getParkingSpot().getNumber());
    ticketReponse.setOperatorName(ticket.getOperator().getName());

    return ticketReponse;
  }
}
