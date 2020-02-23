package com.flight.model;

public class Flight {

	private int id;
	private String name;
	private String manufacturer_Name;
	private String source;
	private String destination;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer_Name() {
		return manufacturer_Name;
	}

	public void setManufacturer_Name(String manufacturer_Name) {
		this.manufacturer_Name = manufacturer_Name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", manufacturer_Name=" + manufacturer_Name + ", source=" + source
				+ ", destination=" + destination + "]";
	}

	public Flight(int id, String name, String manufacturer_Name, String source, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer_Name = manufacturer_Name;
		this.source = source;
		this.destination = destination;
	}
	
}
