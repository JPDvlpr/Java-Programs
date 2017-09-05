package comparison_objects;

import java.util.Arrays;

public class TestSortingUmbrella
{

	public static void main(String[] args)
	{
		//create a few umbrellas
		Umbrella[] umbrellas = {
				new Umbrella("Black", 20, false, 19.99),
				new Umbrella("Beige", 15, true, 29.99),
				new Umbrella("Red", 15, true, 29.99),
				new Umbrella("Blue", 25, true, 39.99),
				new Umbrella("Black", 30, false, 9.99),
		};
		
		//sort umbrellas
		Arrays.sort(umbrellas);
		
		for(Umbrella umbrella : umbrellas)
		{
			System.out.println(umbrella);
		}
	}

}
