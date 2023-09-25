package org.tnsif.Multithreading;

public class ThreadImp1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=50;i++)
		{
			System.out.print(i+ "\t");
			try 
			{
				Thread.sleep(200);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
	}

}
