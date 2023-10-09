package org.tnsif.Queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> aqueue =new PriorityQueue<Integer>();
			aqueue.add(40);
			aqueue.add(70);
			aqueue.add(90);
			aqueue.add(50);
			System.out.println(aqueue);

			System.out.println("Size: "+aqueue.size());
			System.out.println("Is Queue is Empty: "+aqueue.isEmpty());
			System.out.println("Element of be remove first is :"+aqueue.peek());
			System.out.println(aqueue);
			
			while(!aqueue.isEmpty())
			{
				System.out.println(aqueue.remove()+" removed");
			}
			System.out.println(aqueue);
	}

}
