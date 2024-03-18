package com.productapp.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	static Connection connection;

	public static Connection openConnection() {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "system";
		try {
			connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			statement.execute(Queries.CREATEQUERY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection() {

		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
