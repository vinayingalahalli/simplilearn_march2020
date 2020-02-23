package com.flight.main;

import java.util.List;
import java.util.Scanner;

import com.flight.bo.FlightBO;
import com.flight.bo.impl.FlighBoImpl;
import com.flight.exception.BusinessException;
import com.flight.model.Flight;

public class FlightMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to My Flight App V1.0");
		System.out.println("---------------------------------");
		int ch = 0;
		FlightBO bo = new FlighBoImpl();
		do {
			System.out.println("Main Menu");
			System.out.println("===========");
			System.out.println("1)Create Flight");
			System.out.println("2)Search Flight By Id");
			System.out.println("3)Search Flight By Source Name");
			System.out.println("4)Search Flight By Destination Name");
			System.out.println("5)EXIT");
			System.out.println("Enter the choice(1-5)");
			try {
				ch = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
			}
			switch (ch) {
			case 1:
				Flight flight = new Flight();
				System.out.println("Enter Flight Name");
				flight.setName(scanner.nextLine());
				System.out.println("Enter Flight Manufacturer Name");
				flight.setManufacturer_Name(scanner.nextLine());
				System.out.println("Enter Flight Source");
				flight.setSource(scanner.nextLine());
				System.out.println("Enter Flight Destination");
				flight.setDestination(scanner.nextLine());
				try {
					flight = bo.createFlight(flight);
					if (flight.getId() != 0) {
						System.out.println("Flight created with below details");
						System.out.println(flight);
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 2:
				System.out.println("Enter flight id to get flight details");
				try {
					int id = Integer.parseInt(scanner.nextLine());
					Flight f=bo.getFlightById(id);
					if(f!=null) {
						System.out.println("Flight with id "+id+" found...Details are....");
						System.out.println(f);
					}
				} catch (NumberFormatException e) {
					System.out.println("Id cannot be alphabets");
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:System.out.println("Enter Source to get the flights");
			String source=scanner.nextLine();
				try {
					List<Flight> flightList=bo.getFlightsBySourceName(source);
					if(flightList!=null && flightList.size()>0) {
						System.out.println("There are total "+flightList.size()+" no of flight/s found... Here we go");
						for(Flight f:flightList) {
							System.out.println(f);
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 4:
				System.out.println("Thanks for your interest... This is under construction");

				break;
			case 5:
				System.out.println("Thanks for using our App...");

				break;
			default:
				System.out.println("Invalid choice.. CHoice should be integer between 1-5");
				break;
			}
		} while (ch != 5);

	}

}
