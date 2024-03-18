package com.productapp.util;

public class Queries {

	public static final String CREATEQUERY = 
	"create table product (productName varchar(20),productId integer primary key ,brand varchar(30),price number)";
	public static final String INSERTQUERY = "insert into product(productName,productId,brand,price)  values(?,?,?,?)";
	public static final String SELECTQUERY = "select * from product()";
	
	
//	public static final String UPDATEQUERY = "update doctor set fees=? where doctorId=?";
//	
//	public static final String QUERYBYID = "";
//	public static final String QUERYBYSPECIALITY = "";
//	public static final String QUERYBYSPECIALITYEXP = "";

	

}
