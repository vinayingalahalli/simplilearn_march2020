package com.product;

import java.util.List;
import java.util.Scanner;

import com.product.bo.ProductBO;
import com.product.bo.impl.ProductBoImpl;
import com.product.dao.impl.ProductDaoImpl;
import com.product.exception.BusinessException;
import com.product.model.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Product CRUD App V1.0");
		System.out.println("---------------------------------------");
		Scanner scanner = new Scanner(System.in);
		int ch = 0;
		ProductBO productBO = new ProductBoImpl();
		do {
			System.out.println("Main Menu");
			System.out.println("-----------");
			System.out.println("1)Create Product");
			System.out.println("2)Update Product");
			System.out.println("3)Get Product By Id");
			System.out.println("4)Get Products By ManufacturerName");
			System.out.println("5)Get All Products");
			System.out.println("6)Delete Product");
			System.out.println("7)EXIT");
			System.out.println("Enter your choice");
			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {

			}
			switch (ch) {
			case 1:
				Product product = new Product();
				System.out.println("Enter Product Name");
				product.setName(scanner.nextLine());
				System.out.println("Enter Product Manufacturer Name");
				product.setManufacturerName(scanner.nextLine());
				try {
					System.out.println("Enter Product Cost");
					product.setCost(Double.parseDouble(scanner.nextLine()));
					System.out.println("Enter Product Rating");
					product.setRating(Float.parseFloat(scanner.nextLine()));
					product = productBO.addProduct(product);
					if (product.getId() != 0) {
						System.out.println("Product added successfully details are");
						System.out.println(product);
					}
				} catch (NumberFormatException e) {
					System.out.println("Cost or Rating cannot be alphabet.. please renter...");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 3:
				System.out.println("Enter product Id to get product details");
				try {
					int id = Integer.parseInt(scanner.nextLine());
					Product product2=productBO.getProductById(id);
					if(product2!=null) {
						System.out.println("Product with id "+id+" found. Details are...");
						System.out.println(product2);
					}
				} catch (NumberFormatException e) {
					System.out.println("Id should be number only");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Thank you for your interest.. This is under construction");

				break;
			case 4:
				System.out.println("Thank you for your interest.. This is under construction");

				break;
			case 5:
				try {
					List<Product> productList = new ProductDaoImpl().getAllProducts();
					System.out.println("Printing all the products");
					for (Product p : productList) {
						System.out.println(p);
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 6:
				System.out.println("Thank you for your interest.. This is under construction");

				break;
			case 7:
				System.out.println("Thank you for using our Product CRUD app....");

				break;

			default:
				System.out.println("Entered choice is invalid. Choice should numerical between (1-7)");
				break;
			}
		} while (ch != 7);

	}

}
