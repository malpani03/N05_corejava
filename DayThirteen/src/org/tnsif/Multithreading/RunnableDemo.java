package org.tnsif.Multithreading;

public class RunnableDemo {

	//FirstCase --Traditional Method
	public static void main(String[] args) throws InterruptedException {
		ThreadImp1 t1=new ThreadImp1();
		Thread threadone=new Thread(t1);
		threadone.start();
		
		Runnable obj=new Runnable()
				{
					@Override
					public void run() 
					{
						char ch='a';
						for(int i=1;i<=26;i++,ch++)
							
						{
							System.out.print(ch+"\t");
							try
							{
								Thread.sleep(200);
							} catch (InterruptedException e) 
							{
								e.printStackTrace();
							}
						}
											
					}
			
				};
				Thread threadtwo=new Thread(obj);
				threadtwo.start();
				
				//ThirdCase--Lambda
				Runnable object=()->
				{
					for(int i=1;i<=100;i+=2)
					{
						System.out.print(i+"\t");
						try 
						{
							Thread.sleep(200);
						}
						catch (InterruptedException e) 
						{
							
							e.printStackTrace();
						}
					}
				};
				Thread threadthree=new Thread(object);
				threadthree.start();
				
				Thread.sleep(500);
				System.out.println("-------------------");
	}
}
