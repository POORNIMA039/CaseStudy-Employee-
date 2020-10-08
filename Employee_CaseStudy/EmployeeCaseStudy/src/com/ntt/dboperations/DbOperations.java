package com.ntt.dboperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ntt.model.Employee;

public class DbOperations {
	private int r = 0;

	// Creating a Employee details
	public int createEmployee(Employee ep)  {
		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
		try {
			con = DbConnection.openConnection();
			String input = SqlQueries.QUERY1; // fetching sql query from SqlQueries Class.
			pstmt = PreparedStmts.insert(con, input, ep);
			res = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			displayKey(rs); // method to display a value using Resultset
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			DbConnection.closeConnection();
		}
		return res;
	}

	// Reading a details from employee table
	public void readEmployee(Employee ep1)   {
		try {
			Connection con = null;
			ResultSet rs = null;
			Statement stmt = null;
			con = DbConnection.openConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(SqlQueries.QUERY2 + ep1.getEmployeeId());
			if (rs.first()) {
				rs = stmt.executeQuery(SqlQueries.QUERY2 + ep1.getEmployeeId());

				while (rs.next()) {

					System.out.println("employee_Id : " + rs.getInt("employeeId") + "\nemployee_Name : "
							+ rs.getString("employeeName") + "\nemployee_Address : " + rs.getString("employeeAddress")
							+ "\ndate_of_Joining : " + rs.getString("dateOfJoining") + "\nexperience : "
							+ rs.getInt("experience") + "\ndate_of_Birth : " + rs.getString("dateOfBirth"));
				}
			} else {
				System.out.println("Employee with given Id not found");
			}
		}catch (SQLException se) {
			se.printStackTrace();
			System.out.println("!!!!!!!!!!!!!");
		} finally {
			DbConnection.closeConnection();
		}
	}

	// Update Employee Details
	public int updateEmployee(Employee ep2)  {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DbConnection.openConnection();
			String up = SqlQueries.QUERY3; // fetching sql query from
											// SqlQueriesClass.
			pstmt = PreparedStmts.update(con, up, ep2); // calls PreparedStmts
														// to access prepared
														// statements and set
														// Values
			r = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			DbConnection.closeConnection();
		}
		return r;
	}

	// Deleting a employee's detail from the table employee
	public int deleteEmployee(Employee ep3) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try { // assigning connection class method to con establish connection with database
			con = DbConnection.openConnection(); // fetching sql query from
												// SqlQueries Class.
			pstmt = PreparedStmts.delete(con, SqlQueries.QUERY4, ep3); 
			r = pstmt.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
		} 

		finally {
			DbConnection.closeConnection();
		}

		return r;
	}

	// Displaying Generated key value on successful Insertion of data into database
	private static void displayKey(ResultSet rs) {
		try {
			if (rs != null && rs.next()) {
				System.out.println();
				System.out.println();
				System.out.println("Congrats!! your Generated Employee_Id: " + rs.getInt(1));
				System.out.println("**************************************");
			} else
				System.out.println("There was an Error while Insertion ");
		} catch (SQLException e) {
			System.out.println(" ResultSet Error!!");
		}
	}
}
	