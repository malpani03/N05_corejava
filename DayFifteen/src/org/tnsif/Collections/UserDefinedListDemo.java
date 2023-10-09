package org.tnsif.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserDefinedListDemo {

	public static void main(String[] args) {
		ArrayList<Employee>empList=new ArrayList<Employee>();
		empList.add(new Employee(1,"Yash",10000f,"HR"));
		empList.add(new Employee(4,"Abhilasha",30000f,"Junior"));
		empList.add(new Employee(3,"sursuri",20000f,"Senior"));
		empList.add(new Employee(2,"Dhole",50000f,"Clerk"));
		
		Collections.sort(empList);
		System.out.println(empList);
		
		Collections.sort(empList,new SortByName());
		System.out.println(empList);
		
		Collections.sort(empList,new SortByDesgination());
		System.out.println(empList);
		
		Comparator<Employee> compOne=(e1,e2)->{
			return (int)(e1.getSalary()-e2.getSalary());
			
		};	
		Collections.sort(empList,compOne);
		System.out.println(empList);
	}

}
