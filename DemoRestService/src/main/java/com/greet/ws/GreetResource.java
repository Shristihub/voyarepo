package com.greet.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest-api")
public class GreetResource {
	
	@GET
	@Path("/greet")
	@Produces(MediaType.TEXT_PLAIN)
	public String greetMessage() {
		return "Have a great day";
	}
	
	@GET
	@Path("/xmloutput")
	@Produces(MediaType.TEXT_XML)
	public String messageXML() {
		return "<?xml version=\"1.0\"?><hello> Hello Jersey</hello>";
	}

	@GET
	@Path("/htmloutput")
	@Produces(MediaType.TEXT_HTML)
	public String messageHtml() {
		return "<html> <body>" + 
	"<h1>Hello Jersey</h1></body></html> ";
	}
	
	
	
	

}
