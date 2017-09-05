package applications;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class ApplicationsWithStacksAndQueues
{

	public static void main(String[] args)
	{
		//what does foo doo?
		foo();
	}

	public static void foo()
	{
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		
		//add a few elements to my queue
		for(int i = 0; i <= 30; i++)
		{
			queue.offer(i);
		}
		
		//print before
		printQueue(queue);
		
		//add all my elements to the stack
		while(!queue.isEmpty())
		{
			stack.push(queue.poll());
		}
		
		//add the elements back to the queue
		while(!stack.isEmpty())
		{
			queue.offer(stack.pop());
		}
		
		//print after
		printQueue(queue);
		
	}
	
	private static void printQueue(Queue<Integer> queue)
	{
		for(int number : queue)
		{
			System.out.println(number + " ");
		}
		System.out.println();
	}
}
