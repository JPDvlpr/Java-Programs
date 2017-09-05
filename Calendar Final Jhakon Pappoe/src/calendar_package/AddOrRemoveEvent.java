/*
 * Michael Kolman
 * 6/13/17
 * AddOrRemoveEvent.java
 * This class allows the user to decide if they are adding
 * or removing an event from their text file.
 */
package calendar_package;

import java.util.Scanner;

/**
 * This class allows the user to decide id they want to remove
 * or add an event to their text file.
 * 
 * @author Michael Kolman
 * @version 1.0
 *
 */
public class AddOrRemoveEvent {
	
	static boolean save;
	static boolean remove;
	static Scanner keyboard = new Scanner(System.in);
	
	/**
	 * This method allows the user to decide if they want to remove
	 * or add an event to their file. It calls the appropriate method
	 * based on input from the user.
	 */
	public static void addOrRemove()
	{
		System.out.println("Add event to the calendar? true/false");
		save = keyboard.nextBoolean();
		
		if(save == true)
		{
			//calls addToCalendar method to save the event to a txt file
			SaveEvent.addToCalendar();
		}
		
		System.out.println("Remove an event from the calendar? (true/false)");
		remove = keyboard.nextBoolean();
			
		if(remove == true) //user is removing an event
		{
			//calls method to remove an event from the txt file
			RemoveEvent.removeFromCalendar();
		}
	}
}
