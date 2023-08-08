package org.tnsif.InterfaceDemo;


/*FunctionalInterface:
 * an interface which contains an exactly one abstract method
 * then that interface is known as functional interface
 */
/*below annotation ensure that we have to use
 * exactly one abstract method insdie an interface  */
@FunctionalInterface
public interface PopCorn {
	
	void displayreceipe();
	//void display();

}
