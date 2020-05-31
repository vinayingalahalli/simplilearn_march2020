package com.book.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.book.dao.BookDAO;
import com.book.exception.BusinessException;
import com.book.model.Book;

public class BookDaoImpl implements BookDAO{

	Configuration configuration = new Configuration().configure();
	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	SessionFactory factory=configuration.buildSessionFactory(builder.build());
	@Override
	public Book createBook(Book book) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
		return book;
	}

	@Override
	public List<Book> getAllBooks() throws BusinessException {
		List<Book> bookList=null;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		bookList=session.createQuery("from com.book.model.Book").list();
		transaction.commit();
		session.close();
		return bookList;
	}

	@Override
	public Book updateBook(Book book) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(book);
		transaction.commit();
		session.close();
		return book;
	}

	@Override
	public Book getBookById(int id) throws BusinessException {
		Book book=null;
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		book=(Book) session.get(Book.class, id);
		transaction.commit();
		session.close();
		if(book==null) {
			throw new BusinessException("No book found with Id "+id);
		}
		return book;
	}

	@Override
	public void deleteBook(int id) throws BusinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		//bookList=session.createQuery("from com.book.model.Book").list();
		Book book=new Book();
		book.setId(id);
		session.delete(book);
		transaction.commit();
		session.close();
		
	}

}
