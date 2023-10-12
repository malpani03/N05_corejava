package org.tnsif.Assignment;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Product p1=new Product();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add \n2.Display\n3.Exit");
			System.out.println("Enter your choice: ");
			
			int ch=sc.nextInt();
			sc.nextLine();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter the Product Name :");
				String productName=sc.nextLine();
				p1.addProductList(productName);
				break;
			case 2:
				p1.sortProductList();
				break;
			case 3:
				System.out.println("Thankyou");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
				break;
			}
					
		}

	}

}
