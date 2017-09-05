package examples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PracticingWithPrintWriter
{
	public static void main(String[] args)
	{
		// write some dummy data to a file called output.txt
		PrintWriter writer = null;

		try
		{
			// request a file handle
			writer = new PrintWriter(new FileOutputStream("output.txt"));

			// write some values
			System.out.println("Writing to my file output");

			// println() ends with a new line character
			writer.println("Hellow world");
			writer.println("Is this working?");

			// print() does not
			writer.print(100);
			writer.print(" ");
			writer.print(200);
			writer.print(" ");
			writer.print(300);
			writer.println(); // move to the next line

			writer.print(true); // boolean value

			writer.print("What happens here?");

			System.out.println("Done writing to file, closing file connection...");
		}

		catch (FileNotFoundException ex)
		{
			System.out.println("Problem writing to a file: " + ex.getMessage());
		}

		finally
		{
			// scenario #1: the try block completes without error and then the
			// finally block will run
			// scenario #2: an exception is thrown , then caught, and then the
			// finally block will run also
			// scenario #3: an exception is thrown, not caught, and then the
			// finally block will still run

			// close our connection to our file
			if (writer != null)
			{
				writer.close();
			}
		}
	}
}
