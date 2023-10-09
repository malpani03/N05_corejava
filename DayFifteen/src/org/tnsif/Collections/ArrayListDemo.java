//Program to demonstrate homogeneous ArrayList
package org.tnsif.Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List <Integer> intList=new ArrayList<Integer>();
		intList.add(10);
		intList.add(130);
		intList.add(20);
		intList.add(128);
		intList.add(107);
		
		
		System.out.println(intList);
		System.out.println("is 10 present "+intList.contains(10));
		System.out.println(intList.indexOf(20)>=0?"Present":"not present");
		System.out.println("Remove element at 4 "+intList.remove(intList.indexOf(20)));
		
		intList.add(2,50);
		
		System.out.println("------After Sorting");
		Collections.sort(intList);
		System.out.println(intList);
		System.out.println("------After Reversing");
		Collections.reverse(intList);
		System.out.println(intList);
		
		Iterator<Integer> it=intList.iterator();
		while(it.hasNext())
		{
			int no=it.next();
			System.out.println(no+":"+no*no);
		}
	}
	

}
