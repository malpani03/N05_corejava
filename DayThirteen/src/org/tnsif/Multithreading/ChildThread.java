package org.tnsif.Multithreading;

public class ChildThread extends Thread{
	public void run() {
		System.out.println("This task is of child thread"+Thread.currentThread());
		ThreadDemo.printHello();
	}

}
