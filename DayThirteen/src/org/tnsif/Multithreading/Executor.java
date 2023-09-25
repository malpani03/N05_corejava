package org.tnsif.Multithreading;

public class Executor {

	public static void main(String[] args) {
		System.out.println("In main...."+Thread.currentThread());
		ChildThread t1=new ChildThread();
		t1.run();
		t1.run();

	}

}
