package queues;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class UsingQueues
{

	public static void main(String[] args)
	{
		//create a queue of names
		Queue<String> peopleQueue = new LinkedBlockingQueue<>();
		
		//add a few names
		peopleQueue.offer("Sarah");
		peopleQueue.offer("Jhakon");
		peopleQueue.offer("Josh");
		peopleQueue.offer("Barber");
		peopleQueue.offer("Liz");
		
		//remove elements
		while(!peopleQueue.isEmpty())
		{
			System.out.println(peopleQueue.poll());
		}
		
		//offer (add)
		//peek (view)
		//poll (view then remove)
		
		//what is the output
		peopleQueue.offer("Sarah");
		peopleQueue.offer("Jhakon");
		System.out.println(peopleQueue.peek());
		System.out.println(peopleQueue.peek());
		System.out.println(peopleQueue.poll());
		peopleQueue.offer("Josh");
		System.out.println(peopleQueue.peek());
		peopleQueue.offer("Barber");
		System.out.println(peopleQueue.poll());
		System.out.println(peopleQueue.poll());
		peopleQueue.offer("Liz");
		
		//Output
		//Sarah 1
		//Sarah 1
		//Jhakon 2
		//Jhakon 2
		//Josh 3
		
		//Queue
		//Barber 4
		//Liz 5
		System.out.println(peopleQueue);
	}

}
