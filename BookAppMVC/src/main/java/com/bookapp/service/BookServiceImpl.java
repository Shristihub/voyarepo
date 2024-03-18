package com.bookapp.service;

import java.util.List;

import com.bookapp.dao.BookDaoImpl;
import com.bookapp.dao.IBookDao;
import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public class BookServiceImpl implements IBookService{
	
	IBookDao bookDao = new BookDaoImpl();

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	@Override
	public List<Book> getByAuthorContains(String author) throws BookNotFoundException {
		// check if list is empty thow exception
		
//		return books.stream().sorted((o1,o2)->).collect()
		return null;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByDatePublished(int year) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}
	


}
