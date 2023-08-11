package com.prakinglot;

import com.prakinglot.controller.TicketController;
import com.prakinglot.dto.TicketRequestDTO;
import com.prakinglot.enums.VehicleType;
import com.prakinglot.exception.InvalidGateException;
import com.prakinglot.exception.NoAvailableParkingSpotException;
import com.prakinglot.repository.GateRepository;
import com.prakinglot.repository.ParkingLotRepository;
import com.prakinglot.repository.TicketRepository;
import com.prakinglot.repository.VehicleRepository;
import com.prakinglot.service.TicketService;
import com.prakinglot.strategy.SpotAssignmentStrategy;

public class MainApp {

  public static void main(String[] args) throws InvalidGateException, NoAvailableParkingSpotException {

    GateRepository gateRepository = new GateRepository();
    VehicleRepository vehicleRepository = new VehicleRepository();
    SpotAssignmentStrategy spotAssignmentStrategy = new SpotAssignmentStrategy();
    TicketRepository ticketRepository = new TicketRepository();
    ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

    TicketService service = new TicketService(gateRepository, vehicleRepository, spotAssignmentStrategy,
      ticketRepository, parkingLotRepository);

    TicketController ticketController = new TicketController(service);

    TicketRequestDTO request = new TicketRequestDTO();
    request.setGateId(1L);
    request.setVehicleNumber("KA0152882");
    request.setVehicleType(VehicleType.CAR);

    ticketController.generateTicket(request);
    System.out.print("Application Started");
  }
}
