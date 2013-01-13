package usc.sabarre.stackthreads;


public class Push extends Thread implements Runnable {
		
		private long ID;
		private Stack stack;
		Push(long ID, Stack stack)
		{
			this.ID = ID;
			this.stack=stack;
		}
		
		@Override
		public void run()
		{
			for(int i = 0; i<=9; i++)
			{
				stack.push(i);
				System.out.println("Pushed " + i
				+ ". Currently: " + (stack.getLast()+1));
			}
		}

}
