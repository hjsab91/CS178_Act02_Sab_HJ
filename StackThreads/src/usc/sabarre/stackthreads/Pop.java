package usc.sabarre.stackthreads;


public class Pop extends Thread implements Runnable {
		
		private long ID;
		private Stack stack;
		Pop(long ID, Stack stack)
		{
			this.ID = ID;
			this.stack=stack;
			
		}
		
		@Override
		public void run()
		{
			
				while(stack.getLast() > -1)
				{
					int j = stack.pop();
					System.out.println("Popped " + j 
					+ ". Remaining: " + (stack.getLast()+1));
				}
		}

}
