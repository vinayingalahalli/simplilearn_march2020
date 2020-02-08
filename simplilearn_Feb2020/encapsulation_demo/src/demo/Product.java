package demo;

public class Product {

	private int id;
	private String name;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void printProduct() {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		System.out.println("Price = "+price);
	}
}
/*
 * Encapsulated Class
 * Bean Class
 * POJO(Plain Old Java Object) Class
 * Model Class
 * Value Object(VO) class
 * Data Transfer Object(DTO/TO) class
 * */
