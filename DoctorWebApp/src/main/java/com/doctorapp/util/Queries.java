package com.doctorapp.util;

public class Queries {

	public static final String CREATEQUERY = 
	"create table doctor (doctorName varchar(20),doctorId integer primary key auto_increment,speciality varchar(30),"
	+ "experience int, fees double,startDate timestamp, endTime timestamp)";
	public static final String INSERTQUERY = 
			"insert into doctor(doctorName,speciality,experience,fees,startDate,endTime)  values(?,?,?,?,?,?)  ";
	public static final String UPDATEQUERY = "update doctor set fees=? where doctorId=?";
	
	public static final String QUERYBYID = "";
	public static final String QUERYBYSPECIALITY = "";
	public static final String QUERYBYSPECIALITYEXP = "";

	

}
