package org.tnsif.uncheckedExceptions;

import java.io.IOException;

public class ThrowExecutor {
	//throws keyword is used to declare an exception
		public static void isEligible(int age,int weight) throws IOException
		{
			if(age>18 && weight>50)
			{
				System.out.println("Eligible to donate the blood");
			}
			else
				//throw keyword is used to throw an exception explicitly
				throw new IOException("Does not fullfil the age and weight criteria");
		}

	public static void main(String[] args) throws IOException {
		isEligible(16,49);
		

	}

}
