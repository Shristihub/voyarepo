package com.simeio.ws;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/rest-api")
public class BookResource {
	// http://localhost:8080/RestBookService/rest-api/greet/Sri
	@GET
	@Path("/greet/{uname}")
	@Produces(value = MediaType.TEXT_PLAIN)
	public String sayHello(@PathParam("uname") String username) {
		return "Welcome " + username;
	}

	// http://localhost:8080/RestBookService/rest-api/show-books
	@GET
	@Path("/show-books")
	@Produces(value = MediaType.APPLICATION_JSON)
	public List<String> showBooks() {
		List<String> books = Arrays.asList("Java", "5amclub", "24hours");
		return books;
	}

	@GET
	@Path("/books-by-cat")
	@Produces(value = MediaType.APPLICATION_JSON)
	public List<String> showBooksByCat(@QueryParam("category") String category) {
		if(category.equals("Thriller"))
		 return Arrays.asList("7 days", "100 days", "24hours");
		else if(category.equals("Tech"))
			 return Arrays.asList("Java", "Spring", "Angular");
		else 
			return Arrays.asList("no books available");
	}

}
