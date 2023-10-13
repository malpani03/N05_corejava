package org.tnsif.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet -It is unordered 
		HashSet<String> courses =new HashSet<String>();
		System.out.println(courses.add("Engineering"));
		courses.add("MCA");
		courses.add("Pharmacy");
		courses.add("MBA");
		System.out.println(courses.add("Engineering"));
		System.out.println(courses);
		
		System.out.println(courses.size());
		Iterator<String>it=courses.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(courses.remove("MBA")?"Course Removed":"Course Not Found");
		System.out.println(courses);
		
		System.out.println("------------------------------------------");
		
		HashSet<Integer>hsOne=new HashSet<Integer>();
		hsOne.add(100);
		hsOne.add(20);
		hsOne.add(50);
		hsOne.add(200);
		
		HashSet<Integer>hsTwo=new HashSet<Integer>();
		hsTwo.add(160);
		hsTwo.add(20);
		hsTwo.add(150);
		hsTwo.add(200);
		
		System.out.println("First set is: "+hsOne);
		System.out.println("Second set is: "+hsTwo);
		hsOne.retainAll(hsTwo);
		System.out.println("Intersection: "+hsOne);
		hsOne.removeAll(hsTwo);
		System.out.println(hsOne);
		
		hsOne.addAll(hsTwo);
		System.out.println("Resultant set is: "+hsOne);
		hsOne.clear();
		System.out.println("Element removed "+hsOne);
		hsOne.add(100);
		hsOne.add(20);
		hsOne.add(50);
		hsOne.add(200);
		System.out.println(hsOne);
		
		//For sorting the set we have to convert it into a List
		ArrayList<Integer> list=new ArrayList<Integer>(hsTwo);
		
		Collections.sort(list);
		System.out.println(list);
		hsTwo=new HashSet<Integer>(list);
		System.out.println("Sorted set is: "+hsTwo);
		
		
		
		
	}

}
