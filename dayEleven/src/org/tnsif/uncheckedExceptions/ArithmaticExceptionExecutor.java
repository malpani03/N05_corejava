package org.tnsif.uncheckedExceptions;

import java.util.*;
public class ArithmaticExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of x & y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		//try block contains exceptional code
		try {
			System.out.println(x/y);
		}
		//catch block handles the exception
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}
		

	}

}
