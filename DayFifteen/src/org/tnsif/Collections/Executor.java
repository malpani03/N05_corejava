//Program to demonstrate heterogeneous List
package org.tnsif.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Executor {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List listOne =new ArrayList();
		listOne.add(10);
		listOne.add(true);
		listOne.add(34.8F);
		listOne.add("Hello");
		listOne.add(10);
		listOne.add(new String("Hi"));
		
		System.out.println(listOne);
		
		//ClasscastException
		Collections.sort(listOne);
	}

}
