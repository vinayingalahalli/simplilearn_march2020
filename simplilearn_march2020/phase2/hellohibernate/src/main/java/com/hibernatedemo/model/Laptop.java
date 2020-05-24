package com.hibernatedemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@Table(name = "lap_tbl") if you need table as different name
@Table
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String modelName;
	private double cost;
	@Column(nullable = false,name = "manName", length = 100)
	private String manufacturerName;
	@Temporal(TemporalType.TIMESTAMP)
	private Date manufacturedDate;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(int id, String modelName, double cost, String manufacturerName) {
		super();
		this.id = id;
		this.modelName = modelName;
		this.cost = cost;
		this.manufacturerName = manufacturerName;
	}

	public Laptop(String modelName, double cost, String manufacturerName) {
		super();
		this.modelName = modelName;
		this.cost = cost;
		this.manufacturerName = manufacturerName;
	}

	public Laptop(String modelName, double cost, String manufacturerName, Date manufacturedDate) {
		super();
		this.modelName = modelName;
		this.cost = cost;
		this.manufacturerName = manufacturerName;
		this.manufacturedDate = manufacturedDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", modelName=" + modelName + ", cost=" + cost + ", manufacturerName="
				+ manufacturerName + ", manufacturedDate=" + manufacturedDate + "]";
	}

	
	
	
}
