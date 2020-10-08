package com.ntt.dboperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

 class DbConnection {
	static String url = "jdbc:mysql://localhost:3306/db_employee";
	static String user = "root";
	static String pass = "root";


	// Establishes Connection with Sql Server
	public static  Connection openConnection()  {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
		if (con != null) {
			System.out.println(" Susccefully Connected to database");
		}
		
		} catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return con;
	}

	// close connection
	public static void closeConnection() {
		Connection con = null;
		Statement stmt = null;
		try {
			
			if (stmt != null)
				stmt.close();
			if (con!=null)
				con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
