package org.tnsif.client;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.tnsif.entity.Employee;
import org.tnsif.service.EmployeeServiceImpl;

public class Executor {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		int ch;
		String empName;
		int empNo;
		float salary;
		Employee emp;
		List<Employee>empList;
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		do
		{
			System.out.println("----------Employee------------");
			System.out.println("1.Add");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Display All Employees");
			System.out.println("5.Exit");
			System.out.println("Enter your Choice: ");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Employee Details: ");
				System.out.println("Employee no: ");
				empNo=sc.nextInt();
				sc.nextLine();
				System.out.println("Employee Name: ");
				empName=sc.nextLine();
				System.out.println("Employee Salary: ");
				salary=sc.nextFloat();
				emp = new Employee(empNo, empName, salary);
				int n=service.addEmployee(emp);
				System.out.println(n>0?n+"Employee(s) Added SuccessFully":"Insertion Failed");
				break;	
			
			case 2:
				System.out.println("Employee no: ");
				empNo=sc.nextInt();
				n=service.deleteEmployeeByEmpno(empNo);
				System.out.println(n>0?n+"Employee Deleted SuccessFully":"Deletion Failed");
				break;
				
			case 3:
				System.out.println("Employee no to modify a record :");
				empNo=sc.nextInt();
				sc.nextLine();
				System.out.println("Employee new Name: ");
				empName=sc.nextLine();
				System.out.println("Employee new Salary :");
				salary=sc.nextFloat();
				emp = new Employee(empNo, empName, salary);
				n=service.updateEmployeeByEmpno(empNo,emp);
				System.out.println(n>0?n+"Employee(s) Updated SuccessFully":"No records to update");
				break;
				
			case 4:
				empList=service.getAllEmployees();
				System.out.println(empList);
				break;
				
			case 5:
				System.out.println("ThankYou for using the application");
				
				break;
				
			default:
				System.out.println("Invalid Input");
				break;
		}
	}
		while(ch<5);
		
	}

}
