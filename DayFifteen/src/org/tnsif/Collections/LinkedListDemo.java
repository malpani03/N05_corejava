package org.tnsif.Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList<String>strList=new LinkedList <String>();
			//adding elements in the LinkedList
			strList.add("Yash");
			strList.add("Raghunath");
			strList.add("Dhole");
			strList.add("Malegaon");
			strList.add("Nashik");
		
			System.out.println(strList);
			strList.addFirst("Shreeman");
			strList.addLast("PointMatrix");
			
			System.out.println(strList);
			System.out.println("First element: "+strList.getFirst());
			System.out.println("Last element: "+strList.getLast());
			System.out.println("Remove Element at 5: "+strList.remove(4));
			System.out.println("Is Dhole removed from the list: "+strList.remove("Dhole"));
			System.out.println(strList);
			Collections.sort(strList);
			System.out.println(strList);
			System.out.println("-------------------------------------------------");
			
			//Using List Iterator
			/*ListIterator<String> listIt=strList.listIterator();
			while(listIt.hasNext())
			{
				System.out.println(listIt.next().toUpperCase()+" ");
			}
			System.out.println("-------------------------------------------------");
			System.out.println(strList);
			while(listIt.hasPrevious())
			{
				System.out.println(listIt.previous().toUpperCase());
			}
			System.out.println(strList.size());*/
			
			ListIterator<String> listIt=strList.listIterator(strList.size());
			while(listIt.hasNext())
			{
				System.out.println(listIt.next().toUpperCase()+" ");
			}
			System.out.println("-------------------------------------------------");
			System.out.println(strList);
			while(listIt.hasPrevious())
			{
				System.out.println(listIt.previous().toUpperCase());
			}
	}

}
