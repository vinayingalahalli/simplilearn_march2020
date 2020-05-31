package com.book.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.book.exception.BusinessException;
import com.book.model.Book;
import com.book.service.BookService;
import com.book.service.impl.BookServiceImpl;

@Path("/books")
public class BookSearchController {
	
	private BookService bookService=new BookServiceImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAllBooks(){
		try {
			return bookService.getAllBooks();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
