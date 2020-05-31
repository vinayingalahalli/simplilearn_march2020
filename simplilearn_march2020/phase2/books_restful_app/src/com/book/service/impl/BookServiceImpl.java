package com.book.service.impl;

import java.util.List;

import com.book.dao.BookDAO;
import com.book.dao.impl.BookDaoImpl;
import com.book.exception.BusinessException;
import com.book.model.Book;
import com.book.service.BookService;

public class BookServiceImpl implements BookService{
private BookDAO bookDAO=new BookDaoImpl();
	@Override
	public Book createBook(Book book) throws BusinessException {
		// TODO Auto-generated method stub
		return bookDAO.createBook(book);
	}

	@Override
	public List<Book> getAllBooks() throws BusinessException {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}

	@Override
	public Book updateBook(Book book) throws BusinessException {
		// TODO Auto-generated method stub
		return bookDAO.updateBook(book);
	}

	@Override
	public Book getBookById(int id) throws BusinessException {
		if(id>0 && id<1000) {
		return bookDAO.getBookById(id);
		}else {
			throw new BusinessException("Book Id "+id+" is invalid or not found");
		}
	}

	@Override
	public void deleteBook(int id) throws BusinessException {
		// TODO Auto-generated method stub
		bookDAO.deleteBook(id);
	}

}
