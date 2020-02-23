package com.flight.bo.impl;

import java.util.List;

import com.flight.bo.FlightBO;
import com.flight.dao.FlightDAO;
import com.flight.dao.impl.FlightDaoImpl;
import com.flight.exception.BusinessException;
import com.flight.model.Flight;

public class FlighBoImpl implements FlightBO {

	private FlightDAO dao=new FlightDaoImpl();
	@Override
	public Flight createFlight(Flight flight) throws BusinessException {
		String source=flight.getSource();
		if(source!=null && source.matches("[a-zA-Z]{3,10}")) {
			flight=dao.createFlight(flight);
		}else {
			throw new BusinessException("Source "+source+" is invalid");
		}
		return flight;
	}

	@Override
	public Flight getFlightById(int id) throws BusinessException {
		Flight flight=null;
		if(id>0) {
			flight=dao.getFlightById(id);
		}else {
			throw new BusinessException("Flight id cannot be -ve or zero");
		}
		return flight;
	}

	@Override
	public List<Flight> getFlightsBySourceName(String source) throws BusinessException {
		List<Flight> flightList=null;
		if(source!=null && source.matches("[a-zA-Z]{3,10}")) {
			flightList=dao.getFlightsBySourceName(source);
		}else {
			throw new BusinessException("Source "+source+" is invalid");
		}
		return flightList;
	}

	@Override
	public List<Flight> getFlightsByDestinationName(String destination) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
