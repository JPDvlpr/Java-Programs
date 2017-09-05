package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


//Calendar4.java a very resourceful program to print the calendar
//of a month / year and add events to it in order to stay organized.

/*
* This program greets the user and shows basic details and a message
* Then receives two integers (m yyyy) from user: (Ex: 6 2017)
* The equivalence is June 2017
* Then, the calendar will show the month and year.
* next the user will be asked basic event questions
* followed by that the event will display
* The user will be asked to save or remove an event from their calendar
* this program stores the user events in a text file that can be managed
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

import calendar_package.AddOrRemoveEvent;

 /**
 * @author Jhakon
 * Calendar4.java a very resourceful program to print the calendar.
 * of a month / year and add events to it in order to stay organized.
 * This program greets the user and shows basic details and a message.
 * Then receives two integers (m yyyy) from user: (Ex: 6 2017).
 * The equivalence is June 2017.
 * Then, the calendar will show the month and year.
 * next the user will be asked basic event questions.
 * followed by that the event will display.
 * The user will be asked to save or remove an event from their calendar.
 * this program stores the user events in a text file that can be managed.
 */

public class Calendar4
{
	private static final DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	public static String newEventArray = "";
	static Scanner keyboard = new Scanner(System.in);
	static String pattern = "([jJ][aA][nN]|"
			+ "[fF][eE][bB]|"
			+ "[mM][aA][rR]|"
			+ "[aA][pP][rR]|"
			+ "[mM][aA][yY]|"
			+ "[jJ][uU][nN]|"
			+ "[jJ][uU][lL]|"
			+ "[aA][uU][gG]|"
			+ "[sS][eE][pP]|"
			+ "[oO][cC][tT]|"
			+ "[nN][oO][vV]|"
			+ "[dD][eE][cC])-([1-2][0-9]|[3][0-1]|[1-9])-(\\d\\d\\d\\d)";


	// private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

	/**
	 * Main retrieves the month and year from the
	 * user afterwards it evaluates the weekday of 
	 * the first day of the month and the number
	 * of days in that month.
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException
	{
		// checks he current time and displays
		// a message based on the time
		Calendar cal2 = Calendar.getInstance();
		int timeOfDay = cal2.get(Calendar.HOUR_OF_DAY);
		String greeting = null;
		if (timeOfDay >= 1 && timeOfDay < 12)
		{
			greeting = "Good Morning";
		} else if (timeOfDay >= 12 && timeOfDay < 16)
		{
			greeting = "Good Afternoon";
		} else if (timeOfDay >= 16 && timeOfDay < 21)
		{
			greeting = "Good Evening";
		} else if (timeOfDay >= 21 && timeOfDay < 24)
		{
			greeting = "Good Night";
		}

		// Calendar Event Program Intro
		System.out.println("\n" + greeting + ", Welcome to The Calendar Event Program!");
		System.out.println("\n\n\n   DATE   |  TIME\n" + sdf.format(cal2.getTime())); // yyyy/MM/dd
																						// HH:mm:ss
		System.out.println("\n\n\nA great calendar is like a great personal assistant. "
				+ "\n\nKeeping your days flowing smoothly." + " Without them, \n\nmost of us would miss appointments,"
				+ " forget birthdays, and disregard deadlines.");

		/*
		 * Different types of date time formats Date date = new Date();
		 * System.out.println(sdf.format(date)); //yyyy/MM/dd HH:mm:ss
		 * 
		 * LocalDateTime now = LocalDateTime.now();
		 * System.out.println(dtf.format(now)); // yyyy/MM/dd HH:mm:ss
		 * 
		 * LocalDate localDate = LocalDate.now();
		 * System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(
		 * localDate)); //yyyy/MM/dd
		 */

		// Calendar UI
		CalendarRetrieve cal = new CalendarRetrieve(timeOfDay, timeOfDay, timeOfDay);

		int day = cal.getDay();
		int month = cal.getMonth();
		int year = cal.getYear();

		// Asks for user to input a month and year
		Scanner console = new Scanner(System.in);
		System.out.print("\n\n\nEnter The Month And Year you'd like to place your event in (Ex. 1 2017): ");

		// reads the month and year as a string
		String monthText = console.next();
		String yearText = console.next();

		// close scanner
		// in.close();

		try
		{
			// convert month and year to integer.
			// day = Integer.parseInt(dayText);
			month = Integer.parseInt(monthText);
			year = Integer.parseInt(yearText);

			// check if month is between 1-12
			if (month < 1 || month > 12 || yearText.length() < 4 || yearText.length() > 4)
			{
				throw new Exception("Error! Enter a valid date format (Ex: 1 2017):");
			}

			// print the calendar that the user enters.
			printCalendarMonthYear(month, year);

			// throws NumberFormatException if user enters
			// values in the wrong format.
		} catch (NumberFormatException e)
		{
			// prints the NumberFormatException message
			System.out.println("Number Format Error: " + e.getMessage());
		}
		// catches all other errors
		catch (Exception e)
		{
			// prints all other Exceptions
			System.out.println(e.getMessage());
		}

		// asks the user for the name of the event
		console.nextLine();
		System.out.println("\nEnter the name of your event");
		String eventName = console.nextLine();
		console.nextLine(); // clears the buffer

		// ask the user for the day of the event
		System.out.println("Enter the day of your event (Ex:Jan-1-2017)");
		String eventDay = console.nextLine();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
		Date date2 = null;
		try
		{
			date2 = dateFormat.parse(eventDay);
		}
		// checks for correct parsing
		catch (ParseException e)
		{
			System.out.println("Format Error: " + e.getLocalizedMessage());
			// + ". Please enter in the following format (Ex:Jan-1-2017)");
			// console.nextLine(); // clears the buffer
		}

		boolean temp = true;
		// checks to see if the date format is correct MMM-dd-yyyy
		while (temp)
		{
			if (eventDay.matches(pattern))
			{
				temp= false;
			} 
			else if (!(eventDay.matches(pattern)))
			{
				System.out.println("Enter the day of your event (Ex:Jan-1-2017)");
				eventDay = console.nextLine();
			}
		}

		// asks the user for the length of event
		System.out.println("How long is your event?");
		String eventLength = console.nextLine();
		console.nextLine(); // clears the buffer

		// asks the user for the summary of event
		System.out.println("What is the summary of your event?");
		String eventSummary = console.nextLine();
		console.nextLine(); // clears the buffer

		// array list that stores all the user input
		ArrayList<String> eventArray = new ArrayList<String>();

		// String used for the eventArray print
		//String newEventArray = "";

		eventArray.add("Event Name: " + eventName + " Event Date: " + eventDay + " Event Length: " + eventLength
				+ " Event Summary: " + eventSummary);

		// converts eventArray to a string
		for (String s : eventArray)
		{
			newEventArray += s + "\t";
		}

		// prints the users event
		System.out.println(newEventArray);

		//calls method that allows the user to add or remove an event
		AddOrRemoveEvent.addOrRemove();
	}

	/**
	 * prints a calendar month based on user month and year input
	 * @param month
	 * @param year
	 */
	private static void printCalendarMonthYear(int month, int year)
	{
		// this will create a new GregorianCalendar object
		Calendar cal = new GregorianCalendar();

		// Reset/Clear the calendar to the first day of the month/year
		cal.clear();
		cal.set(year, month - 1, 1);

		// print calendar header
		System.out.println("\n" + "       " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US) + " "
				+ cal.get(Calendar.YEAR));

		// gets the weekday of the first day of chosen month.
		int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

		// gets the number of days in chosen month.
		int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// prints anonymous calendar month based on the weekday of the first
		// day of the month and the number of days in that month:
		printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}

	/**
	 * prints an anonymous calendar month based on the weekday of the first day
	 * of the month and the number of days in month:
	 * @param numberOfMonthDays
	 * @param firstWeekdayOfMonth
	 */
	private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth)
	{

		// reset index of weekday
		int weekdayIndex = 0;

		// print calendar weekday header
		System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");

		// leave/skip weekdays before the first day of month
		for (int day = 1; day < firstWeekdayOfMonth; day++)
		{
			System.out.print("    ");
			weekdayIndex++;
		}

		// prints the days of month in tabular format.
		for (int day = 1; day <= numberOfMonthDays; day++)
		{
			// prints the day
			System.out.printf("%1$2d", day);

			// next weekday
			weekdayIndex++;
			// if it is the last weekday
			if (weekdayIndex == 7)
			{
				// reset the weekday and goes to next line
				weekdayIndex = 0;
				System.out.println();

			} else
			{
				// print white space
				System.out.print("  ");
			}
		}

		// print a final new-line.
		System.out.println();
	}
	
	/**
	 * This is a getter for the newEventArray that gets
	 * printed to the console and saved to the text file.
	 * 
	 * @return returns newEventArray
	 */
	public static String getNewEventArray()
	{
		return newEventArray;
	}
}