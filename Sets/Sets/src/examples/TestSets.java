package examples;

import java.util.HashSet;
import java.util.Set;

public class TestSets
{
	public static void main(String[] args)
	{
		// create a couple sets of letters
		Set<Character> first = new HashSet<>();
		Set<Character> second = new HashSet<>();
		//Set<Character> first = new TreeSet<>();
		//Set<Character> second = new TreeSet<>();


		// add a few elements
		first.add('z');
		first.add('s');
		first.add('v');
		first.add('j');
		first.add('p');
		first.add('k');

		second.add('c');
		second.add('z');
		second.add('j');
		second.add('r');
		second.add('m');

		// practice invoking our set operation methods
		// adds all of second NO DUPLICATES
		//UNION
		//first.addAll(second);
		
		//INTERSECTION
		//first.retainAll(second);
		
		//DIFFERENCE A-B first - second
		//first.removeAll(second);
		
		//DIFFERENCE A-B first - second
		second.removeAll(first);

		// print results

		//change for difference vvv
		for (char character : second)
		{
			System.out.println(character);
		}
	}
}
