package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * test run class
 * similar to the test.txt
 * Cal.txt no longer exists
 * @author Jhakon
 *
 */
public class Test
{
	static PrintWriter writer = null;

	/**
	 * used for testing out the .txt file
	 * @param args
	 */
	public static void main(String[] args)
	{
		try
		{
			writer = new PrintWriter("Cal.txt");
			writer.println("The first line");
		} catch (IOException e)
		{
			System.out.println(e.getMessage());
		} finally
		{
			if (writer != null)
			{
				writer.close();
			}
		}
	}
}