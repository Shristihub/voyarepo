package com.doctorapp.ws;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/doctor-api")
public class DoctorResource {

	// http://localhost:8081/DoctorRESTAPI/rest/doctor-api/greet
	@GET
	@Path("/greet")
	@Produces(MediaType.TEXT_PLAIN)
	public String greet() {
		return "Have a great day";
	}

	// http://localhost:8081/DoctorRESTAPI/rest/doctor-api/welcome/username/Priya/city/Ban
	@GET
	@Path("/welcome/username/{uname}/city/{city}")
	@Produces(MediaType.TEXT_PLAIN)
	public String welcomeUser(@PathParam("uname") String username, @PathParam("city") String city) {
		return "Welcome " + username + " to " + city;
	}

	// http://localhost:8081/DoctorRESTAPI/rest/doctor-api/show/ortho
	@GET
	@Path("/show/{speciality}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> showDoctors(@PathParam("speciality") String speciality) {
		if (speciality.equals("ortho"))
			return Arrays.asList("Vijay", "Swathi");
		else
			return Arrays.asList("Monu", "Shreya");
	}

	// http://localhost:8081/DoctorRESTAPI/rest/doctor-api/print-user?uname=Priya&ucity=Bangalore
	@GET
	@Path("/print-user")
	@Produces(MediaType.APPLICATION_JSON)
	public String printUser(@QueryParam("uname") String username, @QueryParam("ucity") String city) {
		return "Hi " + username + " Welcome to " + city;
	}
	
	// http://localhost:8081/DoctorRESTAPI/rest/doctor-api/add-user
	@POST
	@Path("/add-user")
	@Produces(MediaType.APPLICATION_JSON)
	public String addUser(@FormParam("uname") String username, @FormParam("ucity") String city) {
		return "Hi " + username + " Welcome to " + city;
	}

}










