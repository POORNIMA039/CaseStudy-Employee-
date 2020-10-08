package com.ntt.driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.ntt.dboperations.DbOperations;
import com.ntt.model.Employee;


public class Inputs 
{
	DbOperations db = new DbOperations();
	Employee emp = new Employee();
	
	static InputStreamReader ir=new InputStreamReader(System.in);
	static BufferedReader br=new BufferedReader(ir);
	
	public Employee insertEmp()
	{
		try
		{
		System.out.println("Please, Enter the Employee's NAME");
		emp.setEmployeeName(br.readLine());
		System.out.println("Enter the Employee's Address");
		emp.setEmployeeAddress(br.readLine());
		System.out.println("Enter Employee's Date_of_joining(YYYY-MM-DD)");
		emp.setDateOfJoining(br.readLine());
		System.out.println("Enter Employee's Experience");
		String p=br.readLine(); 
		int exp = Integer.parseInt(p);
		emp.setExperience(exp);
		System.out.println("Enter Employee's Date_of_Birth(YYYY-MM-DD)");
		emp.setDateOfBirth(br.readLine());
		int value = db.createEmployee(emp);
		if (value == 0)
			System.out.println("Employee not Created");
		else
			System.out.println("Employee Created");

		}
		catch(IOException e)
		{
			System.out.println("Enter valid inputs");
		}
		return emp;
		
	}
	
	void readEmp() 
	{
		try{
		System.out.println("Enter EmployeeId");
		String p=br.readLine(); 
		int id = Integer.parseInt(p);
		emp.setEmployeeId(id);
		db.readEmployee(emp);
		}
		catch(IOException e)
		{
			System.out.println("Enter valid id");
		}
	}
	
	
	void updateEmp() 
	{
		try
		{
		System.out.println("Enter EmployeeId to update the details");
		String p=br.readLine(); 
		int id = Integer.parseInt(p);
		emp.setEmployeeId(id);
		System.out.println("Enter EmployeeName");
		emp.setEmployeeName(br.readLine());
		System.out.println("Enter EmployeeAddress");
		emp.setEmployeeAddress(br.readLine());
		System.out.println("Enter Date_of_joining");
		emp.setDateOfJoining(br.readLine());
		System.out.println("Enter the Experience");
		String p1=br.readLine(); 
		int exp = Integer.parseInt(p1);
		emp.setExperience(exp);
		System.out.println("Enter Date_of_Birth");
		emp.setDateOfBirth(br.readLine());
		
		int value = db.updateEmployee(emp);
		if (value == 0)
			System.out.println("Employee details not Updated");
		else
			System.out.println("Employee details Updated");
		}
		catch(IOException e)
		{
			System.out.println("Enter valid details");
		}
	}
	
	void deleteEmp()  
	{
		try
		{
		System.out.println("Enter EmployeeId whose details to be removed");
		String p=br.readLine(); 
		int id = Integer.parseInt(p);
		emp.setEmployeeId(id);

		int value = db.deleteEmployee(emp);
		if (value == 0)
			System.out.println("Employee not Deleted");
		else
			System.out.println("Employee Deleted");
	}
	catch(IOException e)
	{
		System.out.println("Enter valid emp_id");
	}
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

