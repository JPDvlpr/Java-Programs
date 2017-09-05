package java_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class babyDriver
{
	private static final int OPTION_THREE = 3;
	private static final int OPTION_TWO = 2;
	private static final int OPTION_ONE = 1;
	private static int mostPopular, leastPopular, menuChoice, current;
	private static Scanner console = new Scanner(System.in);
	private static ArrayList<babyDefault> babies = new ArrayList<>();
	private static Scanner data = null;
	private static String[] readFiles = { "baby_files\\baby_names.dat", "baby_files\\baby_names_full.dat",
			"baby_files\\baby_names_abbrev.dat" };
	private static String line, names, cities, states, frequency, save, popularBaby, leastPopularBaby, currentBabyName;
	private static String[] inputLine;
	private static boolean saveHistory;

	/**
	 * runs the program (driver class)
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{
		for (int i = 0; i < readFiles.length; i++)
		{
			String fileRead = readFiles[i];
			data = new Scanner(new File(fileRead));
			try
			{
				while (data.hasNext())
				{
					line = data.nextLine();
					inputLine = line.split(",");

					names = inputLine[0];
					cities = inputLine[1];
					states = inputLine[2];
					frequency = inputLine[3];

					babyDefault baby = new babyDefault(names, cities, states, frequency);
					babies.add(baby);
				}
			} catch (Exception e)
			{
				System.out.println(e);
			}
		}
		greeting();
	}

	/**
	 * Greeting method with IOException, greets the user and gives them 3
	 * options to choose from
	 * 
	 * @throws IOException
	 */
	public static void greeting() throws IOException
	{
		System.out.println("\n1.Search City\n2.Search Name\n3.Exit.");
		menuChoice = console.nextInt();
		console.nextLine();

		if (menuChoice == OPTION_ONE)
		{
			optionOne();
		} else if (menuChoice == OPTION_TWO)
		{
			optionTwo();
		} else if (menuChoice == OPTION_THREE)
		{
			System.exit(0);
		}
	}

	/**
	 * option one of three, asks user to select city and state and returns
	 * number of babies and their based on the city and state
	 * 
	 * @throws IOException
	 */
	public static void optionOne() throws IOException
	{
		System.out.println("\nEnter a city ");
		cities = console.nextLine();
		System.out.println("\nEnter a state ");
		states = console.nextLine();
		System.out.println("\nCity search: " + cities + " ***************");

		saveResults();

		mostPopular = Integer.parseInt(babies.get(0).getFrequencies());
		leastPopular = Integer.parseInt(babies.get(0).getFrequencies());
		popularBaby = babies.get(0).getNames();
		leastPopularBaby = babies.get(0).getNames();

		// baby names (max popularity)
		for (babyDefault baby : babies)
		{
			if (baby.getCities().equalsIgnoreCase(cities) && baby.getStates().equalsIgnoreCase(states))
			{
				System.out.println(baby.getFrequencies() + " babies named " + baby.getNames());

				current = Integer.parseInt(baby.getFrequencies());
				currentBabyName = baby.getNames();

				if (current > mostPopular)
				{
					mostPopular = current;
					popularBaby = currentBabyName;
				}
				if (current < leastPopular)
				{
					leastPopular = current;
					leastPopularBaby = currentBabyName;
				}
			}
			if (saveHistory)
			{
				saveHistory(baby.getFrequencies() + " babies named " + baby.getNames());
			}
		}
		System.out.println("\nMost popular name: " + popularBaby);
		System.out.println("\nLeast popular name: " + leastPopularBaby);
		greeting();
	}

	/**
	 * user searches by baby name and returns the number of babies in that city
	 * with the name of the users input
	 * 
	 * @throws IOException
	 */
	public static void optionTwo() throws IOException
	{
		System.out.println("\nEnter a baby name: ");
		String name = console.nextLine();

		System.out.println("\nName search: " + name + " ***************");

		saveResults();

		for (babyDefault baby : babies)
		{
			if (baby.getNames().equalsIgnoreCase(name))
			{
				System.out.println(baby.getFrequencies() + " babies found in " + baby.getCities());
			}
			if (saveHistory)
			{
				saveHistory(baby.getFrequencies() + " babies found in " + baby.getCities());
			}
		}
		greeting();
	}

	/**
	 * Asks user if they want to save their results
	 */
	public static void saveResults()
	{
		System.out.println("Do you want to save true/false:");
		save = console.nextLine();
		if (save == "true")
		{
			saveHistory = true;
		} else
		{
			saveHistory = false;
		}
	}

	/**
	 * saves results to history
	 * 
	 * @param data
	 * @throws FileNotFoundException
	 */
	public static void saveHistory(String data) throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(new FileOutputStream("history.txt", true));
		writer.write(data);
		writer.close();
	}
}