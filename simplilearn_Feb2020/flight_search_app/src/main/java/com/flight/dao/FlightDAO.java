package com.flight.dao;

import java.util.List;

import com.flight.exception.BusinessException;
import com.flight.model.Flight;

public interface FlightDAO {
	public Flight createFlight(Flight flight) throws BusinessException;
	public Flight getFlightById(int id) throws BusinessException;
	public List<Flight> getFlightsBySourceName(String source)throws BusinessException;
	public List<Flight> getFlightsByDestinationName(String destination)throws BusinessException;
}
