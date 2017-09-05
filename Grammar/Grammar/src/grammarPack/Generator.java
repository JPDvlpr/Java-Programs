package grammarPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * generates the program creating the maps, sets, and lists
 * 
 * @author Jhakon
 *
 */
public class Generator
{
	TreeMap<String, String> table = new TreeMap<>();
	private Set<String> symbols = new HashSet();
	private List<String> rules;
	private Random rand = new Random();

	/**
	 * throws illegal argument if rules has no value or is null try catch to
	 * read the file and check if the file is found
	 * 
	 * @param rules
	 * @throws IllegalArgumentException
	 */
	public Generator(List<String> rules) throws IllegalArgumentException
	{
		this.rules = rules;
		if (rules.size() == 0 || rules == null)
		{
			throw new IllegalArgumentException();
		}
		try
		{
			Scanner reader = new Scanner(new FileInputStream("files/sentence.txt"));
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		// sentence equals the keys and values
		// parts2 is sentence split by "::="
		// table adds keys and values
		for (int i = 0; i < rules.size(); i++)
		{
			String sentence = rules.get(i);
			String[] parts2 = sentence.split("::=");
			table.put(parts2[0], parts2[1]);
		}

		// prints the table s
		for (String s : table.keySet())
		{
			System.out.println(s);
		}
	}

	/**
	 * Looks to see if table includes the symbols also looks for illegal
	 * argument
	 * 
	 * @param symbol
	 * @return
	 * @throws IllegalArgumentException
	 */
	public boolean contains(String symbol) throws IllegalArgumentException
	{
		// if table contains the key symbols return true
		// else return false
		if (table.containsKey(symbol)) // readLines(symbol)symbol)
		{
			return true;
		} else
		{
			return false;
		}
	}

	/**
	 * returns the symbols
	 * 
	 * @return
	 */
	public Set<String> getSymbols()
	{
		return table.keySet();
	}

	/**
	 * uses map and seperates the keys and values by pipes and empty strings " "
	 * 
	 * @param symbol
	 * @return
	 */
	public String generate(String symbol)
	{
		// if the symbol doesn't begin with "<" it's a value
		// split2 is splitting the values by pipes
		// random generator size of value length
		// Ex: John|Sue|Matt rand(0-2)
		// returns the base case "actual words" with spaces
		if (!(symbol.charAt(0) == '<'))
		{
			String split2[] = symbol.split("[|]");
			int randomNumber = rand.nextInt(split2.length);
			return split2[randomNumber] + " ";
		}

		// rules is equal to table symbols
		// split2 is keys split by pipe
		// random generator size of value length
		// Ex: <np> | <s> = rand(0-1)
		// value equals split2 array and picks a
		// random array spot
		String rules = table.get(symbol);
		String[] split2 = rules.split("[|]");
		int randomNumber = rand.nextInt(split2.length);
		String value = split2[randomNumber];

		// splits the keys by empty string " "
		// Ex: <np> <dp>
		// Creates sentence as an empty string
		String[] split3 = value.split(" ");
		String sentence = "";

		// returns the sentence calls the generate method
		for (int i = 0; i < split3.length; i++)
		{
			sentence += generate(split3[i]);
		}
		return sentence;
	}
}