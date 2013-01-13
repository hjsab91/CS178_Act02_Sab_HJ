package usc.sabarre.stackthreads;
import java.util.ArrayList;
import java.util.List;

import usc.sabarre.threadstack.Pop;
import usc.sabarre.threadstack.Push;


public class Main  {

	public static void main(String[] args)
	{
			Stack stack = new Stack(20);
			List<Thread> threads = new ArrayList<Thread>();
			
			for(int i = 1; i<=2; i++)
			{
				Runnable task = new Push(i, stack);
				Thread worker = new Thread(task);
				worker.setName(String.valueOf(i));
				worker.start();
				threads.add(worker);
			}
			
			for(int i = 0; i<=0; i++)
			{
				Runnable task = new Pop(i, stack);
				Thread worker = new Thread(task);
				worker.setName(String.valueOf(i));
				worker.start();
				threads.add(worker);
			}
	}

}
