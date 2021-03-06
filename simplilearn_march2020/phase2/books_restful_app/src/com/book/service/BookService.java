package com.book.service;

import java.util.List;

import com.book.exception.BusinessException;
import com.book.model.Book;

public interface BookService {

	public Book createBook(Book book)throws BusinessException;
	public List<Book> getAllBooks()throws BusinessException;
	public Book updateBook(Book book)throws BusinessException;
	public Book getBookById(int id) throws BusinessException;
	public void deleteBook(int id) throws BusinessException;
}
