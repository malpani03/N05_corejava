package org.tnsif.UserDefinedException;

//program to demonstrate on user-defined exception
//driver class
import java.util.*;
public class CustomExceptionExecutor {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email_id & Password :");
		String email=sc.nextLine();
		String password=sc.nextLine();
		try 
		{
			if(email.equals("rupeshmalpani03@gmail.com")&& password.equals("Pass@123"))
			{
				System.out.println("Credentials Matched");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println(e);
		}
	
		
	}

}
