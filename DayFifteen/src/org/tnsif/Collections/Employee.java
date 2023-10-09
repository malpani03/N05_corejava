package org.tnsif.Collections;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String empname;
	private float salary;
	private String desgination;
	
	public Employee(int empId, String empname, float salary, String desgination) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
		this.desgination = desgination;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", salary=" + salary + ", desgination="
				+ desgination + "]\n";
	}
	@Override
	public int compareTo(Employee o) {
			//sort based Salary
		//return (int) (getSalary()-o.getSalary());
		//sort based Employee
		return(int) (getEmpname().compareTo(o.getEmpname()));
	}

}

class SortByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpname().compareTo(o2.getEmpname());
	}
	
}

class SortByDesgination implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDesgination().compareTo(o2.getDesgination());
	}
	
}
