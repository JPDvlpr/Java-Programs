package reading_from_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading
{
	
	public static void main(String[] args)
	{ 
		// declare my reader
		Scanner reader = null;
		try
		{
			// assign the reader
			reader = new Scanner(new FileInputStream("C:\\Users\\Jhakon\\workspace\\Baby Registry\\baby name files\\baby_names_abbrev.dat"));

//			int count = countCharacters(reader);
//			System.out.println("Total characters: " + count);
		} 
		catch (FileNotFoundException e)
		{
			// how do we respond
			System.out.println("Error, file missing: " + e.getMessage());
		} 
		finally
		{
			if (reader != null)
			{
				reader.close();
			}
		}
	}

	public static int countWords(Scanner reader)
	{
		int count = 0;
		while (reader.hasNextLine())
		{
			String line = reader.nextLine();
			String[] parts = line.split(", ");
			
			String name = parts[0];
			String city = parts[1];
			String state = parts[2];
			//int frequency = parts[3];
			System.out.println(name);
			System.out.println(city);
			System.out.println(state);

			// print each word on it's own line
			//count += parts.length;
		}
		return count;
	}

	public static int countCharacters(Scanner charReader)
	{
		int count = 0;
		while (charReader.hasNextLine())
		{
			String space = charReader.nextLine();
			String[] parts = space.split(" ");

			// print each word on it's own line
			count += parts.length;

			for (int i = 0; i < parts.length; i++)
			{
				count += parts[i].length(); // how many characters in this word?
			}
		}

		return count;
	}

	public static void printEntireFile(Scanner reader)
	{
		// read the file line by line
		int count = 1;
		while (reader.hasNextLine())
		{
			String line = reader.nextLine();
			System.out.println(count + ": " + line);
		}
	}
}