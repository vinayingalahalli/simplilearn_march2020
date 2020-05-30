package com.onetomany.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemId;
	private String name;
	private double cost;
//	@ManyToOne
//	@JoinColumn(name = "oid",nullable = true)
//	private Orders order;
//	
//	public Orders getOrder() {
//		return order;
//	}
//
//	public void setOrder(Orders order) {
//		this.order = order;
//	}

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Item(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
}
