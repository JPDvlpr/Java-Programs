/*
 * Michael Kolman
 * 6/9/17
 * RemoveEvent.java
 * This class allows the user to remove an event
 * stored in their calendar.
 */
package calendar_package;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class allows the user to remove an event from their
 * calendar.  It reads lines from the stored events file and
 * turns them into an array list.
 * 
 * @author Michael Kolman
 * @version 1.0
 *
 */
public class RemoveEvent {

	private static File inputFile = new File("test.txt");
	private static File tempFile = new File("myTempFile.txt");
	
	private static Scanner reader = null;
	private static PrintWriter writer = null;
	private static Scanner keyboard = new Scanner(System.in);
	
	private static ArrayList<String> testArray = new ArrayList<>();
	
	private static final int MARGIN_OF_ERROR = 1; 
	
	//opens a file reader, fills the ArrayList 
	private static void prepareToRemove()
	{
		try
		{
			reader = new Scanner(new FileInputStream(inputFile));
			
			String line; //line of the file to be checked
			while(reader.hasNextLine())
			{
				line = reader.nextLine();
				testArray.add(line);
			}
			
			//print the list so user doesn't need to open the text file
			for(int i = 0; i < testArray.size(); i++)
			{
				System.out.println(testArray.get(i));
				System.out.println();//blank line to make list easier to read
			}
		}
		catch(FileNotFoundException exception)
		{
			System.out.println("No input file found " + exception.getMessage());
		}
	}
	
	/**
	 * This method takes an integer input from the user
	 * and prints every index of the ArrayList other than
	 * the one selected by the user to a temporary file.  
	 * It then deletes the original file and renames the new one.
	 */
	public static void removeFromCalendar()
	{
		int toRemove; //event to be removed from the calendar
		
		prepareToRemove();
		
		System.out.println("What event do you want to remove? (integer)");
		toRemove = keyboard.nextInt();
		
		try
		{
			writer = new PrintWriter(new FileOutputStream(tempFile));
			
			for(int i = 0; i < testArray.size(); i++)
			{
				//subtract 1 from toRemove so user doesn't need to know that java counts from 0
				if(i != toRemove - MARGIN_OF_ERROR)
				{
					writer.println(testArray.get(i));
				}
			}
		}
		catch(FileNotFoundException exception)
		{
			System.out.println("No output file was found " + exception.getMessage());
		}
		finally
		{
			writer.close();	
		}
		
		reader.close();
		
		//delete original file, rename myTempFile
		inputFile.delete();
		tempFile.renameTo(inputFile);
	}
}