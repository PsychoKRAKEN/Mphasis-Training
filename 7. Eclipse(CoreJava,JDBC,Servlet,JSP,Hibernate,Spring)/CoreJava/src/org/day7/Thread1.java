package org.day7;

public class Thread1 extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++ )
		{
			System.out.println(i);
			try {
				sleep(1000);
			} 
			catch (InterruptedException e) 
			{
						e.printStackTrace();
			}
		}
	}

}
