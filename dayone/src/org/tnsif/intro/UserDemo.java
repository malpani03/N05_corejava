//program to demonstrate user input
package org.tnsif.intro;
import java.util.*;

public class UserDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=s.nextInt();
		
//		System.out.println("Your age is"+" "+age);
//		System.out.println("Enter marks:");
//		float f=s.nextFloat();
//		System.out.println("Your marks are:"+f);
//		String name1="Abhishake";
//		System.out.println("First charcter:"+name1.charAt(0));
		
		System.out.println("Enter String:");
		String name=s.nextLine();
		System.out.println("Name:"+name);
		

	}

}
