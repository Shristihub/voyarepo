package com.bookapp.client;

import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class Client {

	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		bookService.getByCategory("Tech").forEach(System.out::println);
		
		System.out.println("Books by Author");
		bookService.getByAuthorContains("K").forEach(System.out::println);
	}
}
