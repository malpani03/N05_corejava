package org.tnsif.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//LinkedHashSet are in Ordered Manner
		LinkedHashSet<String> cities =new LinkedHashSet<String>();
		cities.add("Nashik");
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nagpur");
		cities.add("banglore");
		System.out.println(cities);
		
		ArrayList<String> list =new ArrayList<String>(cities);
		Collections.sort(list);
		System.out.println(list);
		cities=new LinkedHashSet<String>(list);
		System.out.println(cities);
		
		

	}

}
