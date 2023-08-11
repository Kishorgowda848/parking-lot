package com.prakinglot.repository;

import java.util.Map;
import java.util.TreeMap;

import com.prakinglot.model.Ticket;

public class TicketRepository {

  private Map<Long, Ticket> tickes = new TreeMap<>();
  private Long lastSavedId = 0L;

  public Ticket save(Ticket ticket) {

    ticket.setId(lastSavedId + 1);
    tickes.put(lastSavedId + 1, ticket);
    lastSavedId += 1;

    return ticket;
  }
}
