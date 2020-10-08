package com.ntt.dboperations;

public  class SqlQueries {


	//Sql queries to insert, update,display and Delete
	 static String QUERY1 = "INSERT INTO tb_employee"
			+ "(employeeName,employeeAddress,dateOfJoining,experience,dateOfBirth) values \r\n"
			+ "(?,?,?,?,?)";
	  static String QUERY2 = "SELECT * FROM tb_employee WHERE employeeId=";
	  static String QUERY3 = "UPDATE tb_employee SET employeeName=?,employeeAddress=?,dateOfJoining=?,experience=?,dateOfBirth=? WHERE employeeId=?";
	  static  String QUERY4 = "DELETE FROM tb_employee WHERE employeeId=?";

}
