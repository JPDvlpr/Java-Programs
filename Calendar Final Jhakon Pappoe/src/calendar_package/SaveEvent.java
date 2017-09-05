/*
 * Michael Kolman
 * 6/13/2017
 * SaveEvent.java
 * This class allows the user to save an event to their calendar,
 * by storing the event in a text file.
 */
package calendar_package;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import main.Calendar4;

/**
 * This class allows the user to save an event to their calendar,
 * by storing the event in a text file.
 * 
 * @author Michael Kolman
 * @version 1.0
 *
 */
public class SaveEvent {
	//
	static String result = Calendar4.getNewEventArray();
	
	static PrintWriter writer = null;

	/**
	 * This is the method that writes the event to a text file.
	 * @param newEventArray 
	 */
	public static void addToCalendar()
	{
		try
		{	
			writer = new PrintWriter(new FileOutputStream("test.txt", true));
			writer.println(result);
		}
		catch(FileNotFoundException exception)
		{
			System.out.println("An error occured, could not find the file " + exception.getMessage());
		}
		finally
		{
			if(writer != null)
			{		
				writer.close();
			}
		}
	}
}

