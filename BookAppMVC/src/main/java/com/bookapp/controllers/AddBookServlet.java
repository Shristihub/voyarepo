package com.bookapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IBookService bookService = new BookServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get data from form
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String category = request.getParameter("category");
		double price = Double.parseDouble(request.getParameter("price"));
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		// create book object
		Book book = new Book();
		book.setAuthor(author);
		book.setBookId(bookId);
		book.setCategory(category);
		book.setPrice(price);
		book.setTitle(title);
		
		// create a reference of IBookService
		bookService.addBook(book);
		request.setAttribute("message", "book added successfully");
		//send to view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
		dispatcher.include(request, response);
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
