/*
* Jhakon Pappoe
* 4/13/17
* menu.java
* Random number generator
* This class starts a game where I can choose from 
* a menu which game I want to play and the game result
* will print to the console.
*/
package package6;

import java.util.Random;
import java.util.Scanner;
/**
 * This class represents the start menu. Choose an option 1-4.
 * @author Jhakon Pappoe
 * version 1.0
 */
public class menu
{
	/**
	 * This is the entry point to my application.
	 * This is what starts it. Once the user enters
	 * a value the menu is printed to the screen
	 * to restart the menu unless user chooses to exit.
	 * @param args command-line arguments - Can be executed in the terminal
	 */
	public static void main(String[] args)
	{
			
			while(true)
			{
				menu();
				System.out.println();
			}
		
	}//Ends public static void main
	/**
	 * This is the menu method, when called the main menu will appear
	 */
	public static void menu()
	{
		System.out.println("\nWelcome to my random number generator! Please choose from\nthe following menu: ");
		Scanner console = new Scanner(System.in);
		System.out.println("1.Create a random color\n2.Flip a coin\n3.Generate an array of number\n4.Exit");
		int menuChoice = console.nextInt();
	
		if(menuChoice == 1)
		{
			System.out.println("What type of color should I generate?");
			System.out.println("1.Pick from the following list randomly: red,blue,orange,purple,white,\n"
					+ "green,black,cyan\n2.Pick a random RGB color\n3.Pick a grayscale color");
			int colorChoice = console.nextInt();
			
			if(colorChoice == 1)
			{
				randomColors();		
			}
			else if(colorChoice == 2)
			{
				grayscaleColors();	
			}
			else if(colorChoice == 3)
			{
				RGBColors();
			}
			
		}//Ends else if menu choice 1
		else if(menuChoice == 2)
		{
			coinFlip();
		}	
		else if(menuChoice == 3)
		{		
			randomArray();
		}
		else if(menuChoice == 4)
		{
			System.exit(0);
		}
	}//Ends main menu method 
	/**
	 * This is a random color method when called it generates 
	 * a random color followed by the rgb value 
	 */
	public static void randomColors()
	{
		String[] randomArray = {"red [red=255,green=0,blue=0], blue [red=0,green=0,blue=255]",
				"orange [red=255,green=165,blue=0]","purple [red=128,green=0,blue=128]",
				"white [red=255,green=255,blue=255]","green [red=0,green=255,blue=0]",
				"black [red=0,green=0,blue=0]","cyan [red=0,green=255,blue=255]"};
		Random rand = new Random();
		int value = rand.nextInt(randomArray.length);
		System.out.println("Random color chosen is " + randomArray[value]);
	}//Ends random color method
	/**
	 * this is the grayscale method when called the console will print a random
	 * grayscale color where the rgb values are all the same
	 */
	public static void grayscaleColors()
	{
		int minNum = 0;
		int maxNum = 255;	
	
		String[] rgbArray = {"red=","blue=","green="};
		Random rand = new Random();
		int grayValue = rand.nextInt(maxNum-minNum +1)+minNum;
		
		System.out.println("Color " + "[" + rgbArray[0] + grayValue + "," + rgbArray[1] + grayValue 
				+ "," + rgbArray[2] + grayValue + "]");
	}//Ends grayscale method
	/**
	 *This is the rgb color generator and when called it will prodcue a random
	 *set of rgb values which will result in a random color
	 */
	public static void RGBColors()
	{
		int minNum = 0;
		int maxNum = 255;	
		
		String[] randomArray = {"red=","blue=","green="};
		Random rand = new Random();
		int grayValue = rand.nextInt(maxNum-minNum +1)+minNum;
		System.out.println("Color " + "[" + randomArray[0] + grayValue + "," + randomArray[1] + grayValue 
				+ "," + randomArray[2] + grayValue + "]");
	}//Ends RGBcolor method
	/**
	 * This is the coin flip method, you can flip a coin! 
	 * The console will print the results of the coin flip
	 * rather heads or tails and will keep track of the result
	 * Once the coin lands on the same value three times in a
	 * row the game will end
	 */
	public static void coinFlip()
	{
		Coin coin = new Coin();
		int count = 0;
		int headCount = 0;
		int tailCount = 0;
		boolean last = false;
		boolean firstTime = true;
		String heads = "heads";
		String tails = "tails";
		
		while(count < 3)
		{
			coin.flip();
			if(coin.getState() == true)
			{
				headCount++;
			}
			else
			{
				tailCount++;
			}
			
			if(coin.getState() == last)
			{
				count++;
			}
			else
			{
				count = 1;
				last = coin.getState();
			}
			if(firstTime == true)
			{
				System.out.print(coin.getState()+",");	
			}
			else
			{
				System.out.print(coin.getState());	
			}
			
		}//Ends while loop
		
		//Prints the number of trues or false values
		System.out.println("\nTotal heads:" + headCount +"\nTotal tails:" + tailCount);
	}//Ends else if menu choice 2
	/**
	 * This is the random array method when called there will be
	 * three inputs needed by the user
	 * 1.choose how long the array will be
	 * 2.choose a min value for the array
	 * 3.choose a max value for the array
	 * The console will then print random values within the min and
	 * max range in an array
	 */
	public static void randomArray()
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("How many elements?");
		int elements = console.nextInt();
		int[] myArray = new int[elements];
		
		System.out.println("Min value?");
		int minNum = console.nextInt();
		
		System.out.println("Max value?");
		int maxNum = console.nextInt();
		
		for(int i = 0; i<myArray.length;i++)		
		{
			Random rand = new Random();
			int value = rand.nextInt(maxNum-minNum +1)+minNum;
			myArray[i] = value;
			
			if(i==myArray.length-1)
			{
				System.out.print(myArray[i]);	
			}
			else
			{
				System.out.print(myArray[i] + ", ");
			}
		}//Ends for loop
	}//Ends random array method
}//Ends public class menu