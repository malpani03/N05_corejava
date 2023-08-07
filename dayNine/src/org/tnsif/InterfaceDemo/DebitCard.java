package org.tnsif.InterfaceDemo;

public interface DebitCard {
	/*By deafault all the variables insdie an interface is public
	 * static final and if it is final then we must have to initialize 
	 * value for that variable */
	long cardno=999888822222L;
	/*we cant use concreate method inside the interface
	 * by default,method insdie the interface is abstarct
	 */
	void displayCardDetails();
	//defualt method and static method are new features of java 
	
	default void display()
	{
		System.out.println("Default method");
	}
	static void print()
	{
		System.out.println("Static Method");
	}
	
}
