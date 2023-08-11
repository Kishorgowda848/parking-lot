package com.prakinglot.service;

import java.util.Date;
import java.util.Optional;

import com.prakinglot.enums.VehicleType;
import com.prakinglot.exception.InvalidGateException;
import com.prakinglot.exception.NoAvailableParkingSpotException;
import com.prakinglot.model.Gate;
import com.prakinglot.model.ParkingLot;
import com.prakinglot.model.ParkingSpot;
import com.prakinglot.model.Ticket;
import com.prakinglot.model.Vehicle;
import com.prakinglot.repository.GateRepository;
import com.prakinglot.repository.ParkingLotRepository;
import com.prakinglot.repository.TicketRepository;
import com.prakinglot.repository.VehicleRepository;
import com.prakinglot.strategy.SpotAssignmentStrategy;

public class TicketService {

  private GateRepository gateRepository;

  private VehicleRepository vehicleRepository;

  private SpotAssignmentStrategy spotAssignmentStrategy;

  private TicketRepository ticketRepository;

  private ParkingLotRepository parkingLotRepository;

  public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,
      SpotAssignmentStrategy spotAssignmentStrategy, TicketRepository ticketRepository,
      ParkingLotRepository parkingLotRepository) {
    this.gateRepository = gateRepository;
    this.vehicleRepository = vehicleRepository;
    this.spotAssignmentStrategy = spotAssignmentStrategy;
    this.ticketRepository = ticketRepository;
    this.parkingLotRepository = parkingLotRepository;
  }

  public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType, Long gateId)
      throws InvalidGateException, NoAvailableParkingSpotException {

    Optional<Gate> gateOptional = gateRepository.findByID(gateId);

    if (!gateOptional.isPresent()) {
      throw new InvalidGateException();
    }

    Optional<Vehicle> vehicleOptional = vehicleRepository.findByVehicleNumber(vehicleNumber);

    Vehicle vehicle;

    if (vehicleOptional.isPresent()) {
      vehicle = vehicleOptional.get();
    } else {
      vehicle = new Vehicle();
      vehicle.setNumber(vehicleNumber);
      vehicle.setType(vehicleType);
    }

    Optional<ParkingLot> parkingLot = parkingLotRepository.findByGate(gateOptional.get());

    Optional<ParkingSpot> parkingSpot =
        spotAssignmentStrategy.findSpot(vehicleType, parkingLot.get(), gateOptional.get());

    if (!parkingSpot.isPresent()) {
      throw new NoAvailableParkingSpotException();
    }

    Ticket ticket = new Ticket();
    ticket.setEntryDate(new Date());
    ticket.setGate(gateOptional.get());
    // ticket.setOperator(operator);
    ticket.setParkingSpot(parkingSpot.get());
    ticket.setVehicle(vehicle);

    return ticketRepository.save(ticket);
  }
}
