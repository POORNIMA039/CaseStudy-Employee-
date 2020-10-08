package com.ntt.unittesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.ntt.dboperations.DbOperations;
import com.ntt.model.Employee;

public class Testcases {
	/*
	 * Testing the Functionality with the Inputs given if the users provide
	 * right set of data the Test Will PASS Else the Test Will Fail
	 */
	@Test
	public void testCreateEmployee()  {

		DbOperations db = new DbOperations();
		Employee e1 = new Employee();
		e1.setEmployeeName("pooja");
		e1.setEmployeeAddress("delhi");
		e1.setDateOfJoining("2010-08-05");
		e1.setExperience(1);
		e1.setDateOfBirth("1999-11-21");

		int res = db.createEmployee(e1); // create and insert operation are same
		assertEquals(1, res);

	}

	@Test
	public void testUpdateEmployee() {

		DbOperations db = new DbOperations();
		Employee e1 = new Employee();
		e1.setEmployeeId(3);
		e1.setEmployeeName("radha");
		e1.setEmployeeAddress("bangalore");
		e1.setDateOfJoining("2017-08-05");
		e1.setExperience(1);
		e1.setDateOfBirth("1994-11-21");
		int res = db.updateEmployee(e1); // update operation
		assertEquals(1, res);

	}

	@Test
	public void testDeleteEmployee() {

		DbOperations db = new DbOperations(); // delete operation
		Employee e1 = new Employee();
		e1.setEmployeeId(7);
		int res;
		res = db.deleteEmployee(e1);
		assertEquals(1, res);

	}
}
