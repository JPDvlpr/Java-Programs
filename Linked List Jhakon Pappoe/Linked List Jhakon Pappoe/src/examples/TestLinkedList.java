package examples;

public class TestLinkedList
{
	public static void main(String[] args)
	{
		//create a list
		LinkedList<Double> numbers = new LinkedList<>();

		//add a few elements
		numbers.add(10.0);
		numbers.add(20.0);
		numbers.add(30.0);
		numbers.add(40.0);
		numbers.add(50.0);
		
		numbers.printList();
		
		System.out.println(numbers.remove(30.0));
		System.out.println(numbers.remove(20.0));
		System.out.println(numbers.remove(10.0));
	}
}
