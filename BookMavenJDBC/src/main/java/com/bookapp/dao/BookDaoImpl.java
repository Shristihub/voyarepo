package com.bookapp.dao;

import java.sql.Connection;
import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;

public class BookDaoImpl implements IBookDao{

	@Override
	public void addBook(Book book) {
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByAuthorContains(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByPriceLessThan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByDatePublished(int year) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findById(int bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
