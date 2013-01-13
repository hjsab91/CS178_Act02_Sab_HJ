package usc.sabarre.stackthreads;

public class Stack {
	
	private int max;
	private int last;
	private int[] array;
		
	public Stack(int length)
	{
		last = -1;
		array = new int[length];
		max = length;
	}
	
		public int getLast()
		{
			return last;
		}
		
		public synchronized void push(int i)
		{
			if(last+1 < max)
				array[++last]=i;
		}
		
		public synchronized int pop()
		{		
			return array[last--];
		}

}
