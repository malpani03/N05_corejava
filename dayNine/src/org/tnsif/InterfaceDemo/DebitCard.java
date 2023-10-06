package org.tnsif.InterfaceDemo;

public interface DebitCard {
	/*By default all the variables inside an interface is public
	 * static final and if it is final then we must have to initialize 
	 * value for that variable */
	long cardno=999888822222L;
	/*we can't use concrete method inside the interface
	 * by default,method inside the interface is abstract
	 */
	void displayCardDetails();
	//default method and static method are new features of java 
	
	default void display()
	{
		System.out.println("Default  method");
	}
	static void print()
	{
		System.out.println("Static Method");
	}
	
}
