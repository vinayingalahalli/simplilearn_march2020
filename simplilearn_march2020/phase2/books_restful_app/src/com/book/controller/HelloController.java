package com.book.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class HelloController {

	@GET
	public String helloRestGet() {
		return "Hello welcome to REST API JERSEY Style this is GET request";
	}
	
	@POST
	public String helloRestPost() {
		return "Hello welcome to REST API JERSEY Style this is POST request";
	}
	@PUT
	public String helloRestPut() {
		return "Hello welcome to REST API JERSEY Style this is PUT request";
	}
	@DELETE
	public String helloRestDelete() {
		return "Hello welcome to REST API JERSEY Style this is DELETE request";
	}
	
	@GET
	@Path("{name}")
	public String helloRestGet(@PathParam("name")String name) {
		return "Hello "+name.toUpperCase()+" Welcome to REST API JERSEY Style this is GET request";
	}
}
