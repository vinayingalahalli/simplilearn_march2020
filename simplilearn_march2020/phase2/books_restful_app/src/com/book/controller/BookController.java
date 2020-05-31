package com.book.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.book.exception.BusinessException;
import com.book.model.Book;
import com.book.service.BookService;
import com.book.service.impl.BookServiceImpl;

@Path("/book")
public class BookController {

	private BookService bookService = new BookServiceImpl();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Book createBook(Book book) {

		try {
			return bookService.createBook(book);
		} catch (BusinessException e) {
			System.out.println(e);
		}
		return book;
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Book updateBook(Book book) {

		try {
			return bookService.updateBook(book);
		} catch (BusinessException e) {
			System.out.println(e);
		}
		return book;
	}

//	@GET
//	@Path("/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Book getBookById(@PathParam("id")int id) {
//		try {
//			return bookService.getBookById(id);
//		} catch (BusinessException e) {
//			System.out.println(e);
//		}
//		return null;
//	}

	@GET
	@Path("/{id}")
	public Response getBookById(@PathParam("id") int id) {
		try {
			return Response.ok(bookService.getBookById(id), MediaType.APPLICATION_JSON).build();
		} catch (BusinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}

	@DELETE
	@Path("/{id}")
	public void deleteBookById(@PathParam("id") int id) {
		try {
			bookService.deleteBook(id);
		} catch (BusinessException e) {
			System.out.println(e);
		}
	}

}
