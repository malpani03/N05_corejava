package org.tnsif.StackAndVector;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
			st.add(40);
			st.add(70);
			st.add(90);
			st.add(50);
			System.out.println(st);
			
			
			System.out.println(st);
			System.out.println("Size: "+st.size());
			System.out.println("Is Queue is Empty: "+st.isEmpty());
			System.out.println("Element of be remove first is :"+st.peek());
			System.out.println(st);
			
			while(!st.isEmpty())
			{
				System.out.println(st.pop()+" removed");
			}
			System.out.println(st);
	}
}
