package org.tnsif.uncheckedExceptions;

import java.util.Scanner;

public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of x & y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//try block contains exceptional code
		try {
			System.out.println(x/y);
			//when we use System.exit(0,then finally block does not executed
			//System.exit(0);
		}
		//catch block handles the exception
		//catch(ArithmaticException | NullPointerException e)
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
			//System.exit(0);
		}
		finally 
		{
			//when finally block contains an exception then finally block does not executed
			System.out.println(4/0);
			System.out.println("Finally block executed");
		}
		

	}

}
