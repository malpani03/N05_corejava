package org.tnsif.InterfaceDemo;

//Driver class
//program to demonstrate on an interface
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't create an instance of interface 
		//DebitCard d=new DebitCard();
		SBIDebitCard d=new SBIDebitCard();
		d.displayCardDetails();
		//we can call default method of an interface using the object of implemented class
		d.display();
		DebitCard.print();
		
		
		CheesePopCorn c=new CheesePopCorn();
		c.displayreceipe();
		
		
		College cd=new College();
		
		cd.showName();
		

	}

}
