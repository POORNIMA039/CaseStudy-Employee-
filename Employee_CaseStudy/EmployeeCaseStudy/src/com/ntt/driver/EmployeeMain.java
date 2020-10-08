package com.ntt.driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;


public class EmployeeMain {
	
	public static void main(String[] args) throws Exception {

		Inputs ins = new Inputs();
		try {
			int choice = 0;
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);

			while (choice == 0) {
				System.out.println("select the option");
				System.out.println("Press 1 to Create an Employee details");
				System.out.println("Press 2 to Read Employee details");
				System.out.println("Press 3 to Update Employee details");
				System.out.println("Press 4 to Delete Employee");
				String p=br.readLine(); 
				int option = Integer.parseInt(p);

				switch (option) {
				case 1: ins.insertEmp();
					break;
				case 2: ins.readEmp();
					break;
				case 3: ins.updateEmp();
					break;
				case 4: ins.deleteEmp();
					break;
				default: System.out.println("Please, Select your action");
				}

				System.out.println("Press 0 to continue");
				String p1=br.readLine(); 
				 choice = Integer.parseInt(p1);
				

			}
		} catch (InputMismatchException ime) {
			System.out.println("Please enter the valid input(in number)");
			System.out.println("Connection terminated!!!!!!Please run again");
		}
	}
}
