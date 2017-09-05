import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Queues
{

	public static void main(String[] args)
	{
		 Queue<Integer> randomq = new LinkedList<Integer>();
		 {
		 Random r = new Random();
		 for(int i = 0; i < 10; i++)
		 {
		 randomq.add(r.nextInt(100));
		 }
		 //System.out.println("q = " + randomq);
		 }
		
		 String[] data =
		 {"Jhakon","is","the","greatest","to","ever","do","it"};
		 Queue<String> q = new LinkedList<String>();
		
		 for(String str : data)
		 {
		 q.add(str);
		 }
		
		 String[] dat2 =
		 {"Jhakon","is","the","greatest","to","ever","do","it"};
		 Stack<String> s = new Stack<String>();
		
		 for(String str : data)
		 {
		 s.add(str);
		 }
		
		
//		 System.out.println("q: " + q.peek());
//		 System.out.println("q: " + q.remove());
//		 System.out.println("q: " + q.add("Muffin"));
//		 System.out.println("q: " + q.poll());
//		 System.out.println("q: " + q);
//		 System.out.println("q: " + q.contains(("is")));
//		 System.out.println("q: " + q);
//		 System.out.println("qup: " + q.removeAll(q));
//		 System.out.println("qup: " + q);
//		 System.out.println("qup: " + q);
//		 System.out.println("qup: " + q.toArray());
		 System.out.println("qup: " + q);
//		 q.clear();
//		 System.out.println(q);
		 q.add("ok");
		 System.out.println(q);



		 //		 System.out.println(q);
//		 System.out.println(s);
		//
		//
		//// Stack<Integer> s = new Stack<Integer>();
		//// {
		//// Random r = new Random();
		//// for(int i = 0; i < 10; i++)
		//// {
		//// s.add(r.nextInt(100));
		//// }
		//// System.out.println("s = " + q);
		//// }

		// test +=
		// int x = 10;
		// int y = 5;
		// for(int i = 0; i < 100; i++)
		// {
		// i+=y;
		// System.out.println(i);
		// }

	}

	// public static void queueToStack(Queue<String> q,Stack<String> s)
	// {
	// while(!q.isEmpty())
	// {
	// s.push(q.remove());
	// }
	// System.out.println(q);
	// System.out.println(s);
	// }

}
