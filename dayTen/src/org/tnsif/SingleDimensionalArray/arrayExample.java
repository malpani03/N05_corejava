package org.tnsif.SingleDimensionalArray;
	//program to demonstrate on array using compile-time input value 

public class arrayExample {

	public static void main(String[] args) {
			//declaration and initialization of an array at compile time
			int arr[]= {10,20,30,40,50};
			System.out.println("The value at second index is "+arr[2]);
			//to print all the values of an array
			for(int i:arr)
			{
				System.out.print(i+" ");
			}

	}

}
