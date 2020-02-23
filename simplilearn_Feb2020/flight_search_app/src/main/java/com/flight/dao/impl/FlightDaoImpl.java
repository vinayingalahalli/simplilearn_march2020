package com.flight.dao.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.flight.dao.FlightDAO;
import com.flight.exception.BusinessException;
import com.flight.model.Flight;

public class FlightDaoImpl implements FlightDAO {

	private Map<Integer, Flight> flightList = new LinkedHashMap<>();

	@Override
	public Flight createFlight(Flight flight) throws BusinessException {
		flight.setId(new Random().nextInt());
		flightList.put(flight.getId(), flight);
		return flight;
	}

	@Override
	public Flight getFlightById(int id) throws BusinessException {
		Flight flight=flightList.get(id);
		if(flight==null) {
			throw new BusinessException("No Flight found with id "+id);
		}
		return flight;
	}

	@Override
	public List<Flight> getFlightsBySourceName(String source) throws BusinessException {
		List<Flight> searchList=new ArrayList<>();
		for(Entry<Integer, Flight> e:flightList.entrySet()) {
			if(e.getValue().getSource().equalsIgnoreCase(source)) {
				searchList.add(e.getValue());
			}
		}
		if(searchList.size()==0) {
			throw new BusinessException("No flights found with source "+source);
		}
		return searchList;
	}

	@Override
	public List<Flight> getFlightsByDestinationName(String destination) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
