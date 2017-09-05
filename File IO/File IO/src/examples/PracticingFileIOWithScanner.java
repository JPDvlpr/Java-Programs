package examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticingFileIOWithScanner
{
	public static void main(String[] args)
	{
		Scanner reader = null;
		try
		{
			reader = new Scanner(new FileInputStream("C:\\Users\\Jhakon\\workspace\\Baby Registry\\baby name files\\baby_names_abbrev.dat"));

			// read an entire file into our program
			while (reader.hasNextLine())
			{
				// read in the next line
				String line = reader.nextLine();

				// give the split() method the delimiter between our tokens
				String[] parts = line.split(", ");

				System.out.println("Employee Record");
				System.out.println("***************");

				System.out.println("Id: " + parts[0]);
				System.out.println("Employee: " + parts[1] + " (" + parts[2] + ")");
				System.out.println("Hire date: " + parts[3]);
				System.out.println();

				// another option is the StringTokenizer class
			}
		}

		catch (FileNotFoundException ex)
		{
			System.out.println("Error reading from file: " + ex.getMessage());
		}

		finally
		{
			if (reader != null)
			{
				reader.close();
			}
		}
	}
}
