package com.ntt.dboperations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.ntt.model.Employee;

 class PreparedStmts {
	// accepts connection object, SQL Query,and user Object as a parameter.and
	// sets to values & returns PreparedStatement object.
	

	  static PreparedStatement insert(Connection con, String s, Employee emp) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(s, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, emp.getEmployeeName());
			pstmt.setString(2, emp.getEmployeeAddress());
			pstmt.setString(3, emp.getDateOfJoining());
			pstmt.setInt(4, emp.getExperience());
			pstmt.setString(5, emp.getDateOfBirth());

		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return pstmt;
	}

	 static PreparedStatement update(Connection con, String up, Employee emp) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(up);
			pstmt = con.prepareStatement(SqlQueries.QUERY3);
			pstmt.setInt(6, emp.getEmployeeId());
			pstmt.setString(1, emp.getEmployeeName());
			pstmt.setString(2, emp.getEmployeeAddress());
			pstmt.setString(3, emp.getDateOfJoining());
			pstmt.setInt(4, emp.getExperience());
			pstmt.setString(5, emp.getDateOfBirth());
		} catch (SQLException e) {
			System.out.println("Error!!");
			e.printStackTrace();
		}
		return pstmt;
	}

	  static PreparedStatement delete(Connection con, String del, Employee emp) {
		PreparedStatement pstmt = null;
		try {
			
			pstmt = con.prepareStatement(del);
			pstmt.setInt(1, emp.getEmployeeId());
		} catch (SQLException e) {
			System.out.println("Error!!");
			e.printStackTrace();
		}
		return pstmt;
	}

}
