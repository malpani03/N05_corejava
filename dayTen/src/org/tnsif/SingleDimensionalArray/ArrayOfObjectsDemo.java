package org.tnsif.SingleDimensionalArray;

//Driver Class
//program to demonstrate on array of objects
public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Employee arr[]=new Employee[2];
		arr[0]= new Employee(101,"Yash",85000.00);
		arr[1]=new Employee(102,"Raj",50000.00);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
			

	}

}
