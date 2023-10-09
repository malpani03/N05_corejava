package org.tnsif.Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> aqueue =new ArrayDeque<Integer>();
			aqueue.add(40);
			aqueue.add(70);
			aqueue.add(90);
			aqueue.add(50);
			System.out.println(aqueue);
			
			aqueue.addFirst(10);
			aqueue.addLast(100);
			System.out.println(aqueue);
			System.out.println("Size: "+aqueue.size());
			System.out.println("Is Queue is Empty: "+aqueue.isEmpty());
			System.out.println("Element of be remove first is :"+aqueue.peek());
			System.out.println("Element of be remove first is :"+aqueue.peekFirst());
			System.out.println("Element of be remove last is :"+aqueue.peekLast());
			System.out.println("First element has been removed "+aqueue.removeFirst());
			System.out.println("Last element has been removed "+aqueue.removeLast());
			System.out.println(aqueue);
			
			while(!aqueue.isEmpty())
			{
				System.out.println(aqueue.remove()+" removed");
			}
			System.out.println(aqueue);
	}

}
