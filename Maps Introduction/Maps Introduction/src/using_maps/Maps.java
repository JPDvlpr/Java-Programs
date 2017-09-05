package using_maps;

import java.util.TreeMap;

public class Maps
{
	public static void main(String[] args)
	{
		//associate a city/zip with a current temperature
		TreeMap<String, Double> table = new TreeMap<>();
		
		//add a few key/value pairs
		table.put("Auburn", 52.0);
		table.put("Puyallup", 45.0);
		table.put("Tacoma", 60.0);
		table.put("Port Angeles", 70.0);
		table.put("Kent", 45.0);
		table.put("Bothell", 60.0);

		
		//look-up some values!
		System.out.println("The temperature in Auburn: " + table.get("Auburn"));
		System.out.println("The temperature in Tacoma: " + table.get("Tacoma"));
		System.out.println("The temperature in Seattle: " + table.get("Seattle"));
		
		//determine whether a key or value exists
		System.out.println(table.containsKey("Tacoma"));
		System.out.println(table.containsKey("Seattle"));
		System.out.println(table.containsKey("52.0"));
		System.out.println(table.containsKey("61.0"));
		
		//how do we loop over pairs in the table
		for(int i = 0; i < table.size();i++)
		{
		//	System.out.println(table.get(i));
		}
		
		//looping over keys
		for(String key : table.keySet())
		{
			System.out.println(key);
		}

		//loop over values
		for(double value : table.values())
		{
			System.out.println(value);
		}
		
		//how would we loop over keys and values
		for(String key : table.keySet())
		{
			System.out.println(key + " --> " + table.get(key));
		}
	}
}
