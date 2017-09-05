package calendar_package;

import java.io.*;
import java.util.Scanner;

public class TestEvent {

	//rename to SaveEvent, remove main
	
	static boolean save;
	static boolean remove;
	static PrintWriter writer = null;
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String [] args)
	{
		System.out.println("Save? true/false");
		save = keyboard.nextBoolean();
		
		
		//Event testEvent = new Event(1, 2017);
		
		if(save == true)
		{
			try
			{	
				writer = new PrintWriter(new FileOutputStream("test.txt", true));
				//writer.println(testEvent.toString());
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
		else //user is not saving an event
		{
			System.out.println("Remove an event?");
			remove = keyboard.nextBoolean();
			if(remove == true)
			{
				RemoveEvent.removeFromCalendar();
			}
		}
	}
}
