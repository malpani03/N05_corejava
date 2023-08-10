package org.tnsif.uncheckedExceptions;

public class ArrayIndexOutOfBoundExecutor {
	static void print(int arr[])
	{
		try {
			System.out.println(arr[4]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+ e);
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
		
	}

	public static void main(String[] args)
	{
		int arr[]= {10,50,90};
		print(arr);
		
	}

}
