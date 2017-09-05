package package8;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
/**
 * @author Jhakon
 * ContactArray is the run program
 * below are the private variables
 * and the contacts array
 */
public class ContactArray
{
	private static int personalCounter = 0;
	private static int businessCounter = 0;
	private static int maleCounter = 0;
	private static int femaleCounter = 0;
	private static int totalCompanyCounter = businessCounter + personalCounter;
	private static int totalGenderCounter = maleCounter + femaleCounter;

	private static Contact[] contacts = new Contact[6];
/**
 * @param args
 * this runs the whole program
 */
	public static void main(String[] args)
	{

		contacts[0] = new PersonalContact("Joe", "Smith", "jsmith@gmail.com", true, LocalDate.of(2010, Month.MARCH, 16),
				"100 Evergreen Ave, Seattle, WA, 98999");
		contacts[1] = new PersonalContact("Lawrence", "Williams", "lolawrence@yahoo.com", true,
				LocalDate.of(2000, Month.OCTOBER, 01), "1501 1st St, Tacoma, WA, 98100");
		contacts[2] = new PersonalContact("Rachel", "Garcia", "gargar@comcast.net", false,
				LocalDate.of(1996, Month.FEBRUARY, 20), "12 Forest Drive, Los Angelos, CA, 99301");
		contacts[3] = new BusinessContact("Gregory", "Smith", "gregsmith@livemail.com", true, "Amazon.com",
				"Sales Representative", "222-333-4444");
		contacts[4] = new BusinessContact("Susie", "Adams", "sadams@gmail.com", false, "Group Health",
				"Database Administrator", "333-444-5555");
		contacts[5] = new BusinessContact("Jerome", "Bradley", "bradleyj@yahoo.com", true, "Costco",
				"Software Developer", "555-666-7777");

		while (true)
		{
			ContactArray();
			System.out.println();
		}

	}
/**
 * contactArray method this is the introduction
 * prints a welcome message then gives the user 3
 * options 
 */
	public static void ContactArray()
	{
		System.out.println("\nWelcome to my planner!");
		Scanner console = new Scanner(System.in);
		System.out.println("1.Print planner contacts.\n2.Print statistics\n3.Exit.");
		int menuChoice = console.nextInt();

		if (menuChoice == 1)
		{
			plannerContacts();
		}

		// Ends else if menu choice 1
		else if (menuChoice == 2)
		{
			statistics();
		}

		else if (menuChoice == 3)
		{
			System.exit(0);
		}

	}// Ends ContactArray
	
	/*
	 * first option prints the contacts
	 */
/**
 * plannerContacts method prints all the personal and business contacts
 * call each one from the contacts array
 */
	public static void plannerContacts()
	{
		System.out.println("Personal Contact: " + contacts[0] + "\nPersonal Contact: " + contacts[1]
				+ "\nPersonal Contact: " + contacts[2] + "\nBusiness Contact: " + contacts[3] + "\nBusiness Contact: "
				+ contacts[4] + "\nBusiness Contact: " + contacts[5]); // loop
																		// and
																		// instance
																		// of
	}
/**
 * these are the contact statistics, chosen from the menu
 */
	public static void statistics()
	{
		for (int i = 0; i < contacts.length; i++)
		{
			// Random rand = new Random();
			// int counter1 = 0;
			// int value = rand.nextInt(maxNum-minNum +1)+minNum;
			// contacts[i] = value;
			if (contacts[i] instanceof PersonalContact)
			{
				personalCounter++;
			} else
			{
				businessCounter++;
			}
			if (contacts[i].getGender() == true)
			{
				maleCounter++;
			} else
			{
				femaleCounter++;
			}
		} // Ends for loop

		System.out.println("Number of contacts: " + contacts.length + "\nNumber of personal contacts: "
				+ personalCounter + "\nNumber of business contacts: " + businessCounter + "\nMale contacts: "
				+ maleCounter + "\nFemale Contacts: " + femaleCounter);
	}
	// }//Ends Array
}
