package com.prakinglot.repository;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import com.prakinglot.model.Gate;

public class GateRepository {

  private Map<Long, Gate> gates = new TreeMap<>();

  public Optional<Gate> findByID(Long gateId) {
    gates.put(1L, new Gate());
    if (gates.containsKey(gateId)) {
      return Optional.of(gates.get(gateId));
    }
    return Optional.empty();
  }
}
