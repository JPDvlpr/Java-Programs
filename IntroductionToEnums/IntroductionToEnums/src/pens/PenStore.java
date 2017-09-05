package pens;

import java.util.Scanner;

public class PenStore
{
	// constants
	private static final int VIEW_PENS = 1;
	private static final int SEARCH_PENS = 2;
	private static final int QUIT = 3;

	private static Scanner console = new Scanner(System.in);

	// what pens are in stock?
	private static Pen[] inStock = { new Pen(PenType.BALL_POINT, PenThickness.FINE, PenColor.BLACK),
			new Pen(PenType.FOUNTAIN, PenThickness.REGULAR, PenColor.RED),
			new Pen(PenType.ROLLER_BALL, PenThickness.THICK, PenColor.BLUE) };

	public static void main(String[] args)
	{
		System.out.println("Welcome to my Pen Store!");
		showMenu();
	}

	public static void showMenu()
	{
		while (true)
		{
			System.out.println("1. View pens");
			System.out.println("2. Search pens");
			System.out.println("3. Quit");

			int choice = console.nextInt();
			console.nextLine(); // clear buffer

			if (choice == VIEW_PENS)
			{
				viewPens();
			} else if (choice == SEARCH_PENS)
			{
				searchPens();
			} else if (choice == QUIT)
			{
				break;
			}
		}
	}

	public static void viewPens()
	{
		// print out all the pens
		for (int i = 0; i < inStock.length; i++)
		{
			System.out.println(inStock[i].toString());
		}
	}

	public static void searchPens()
	{
		// get a pen type frpm tre user
		System.out.println("Enter a pen type (BALL_POINT, ROLLER_BALL, FOUNTAIN): ");
		String userInput = console.nextLine();
		// convert string to ENUM
		PenType penType = PenType.valueOf(userInput);

		// highlight our products
		if (penType == PenType.BALL_POINT)
		{
			System.out.println("Printing out all ball-point pens (one year guarantee!): ");
		} else if (penType == PenType.FOUNTAIN)
		{
			System.out.println("We only sell premium fountain pens...");
		} else if (penType == PenType.ROLLER_BALL)
		{
			System.out.println("All roller-ball pens are on sale, 20% off, this week only!");
		}

		// print our search results
		for (int i = 0; i < inStock.length; i++)
		{
			if (inStock[i].getType().equals(penType))
			{
				System.out.println(inStock[i].toString());
			}
		}
	}
}