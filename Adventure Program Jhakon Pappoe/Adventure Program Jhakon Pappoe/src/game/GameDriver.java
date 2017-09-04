package game;

import java.util.Scanner;
import players.Knight;
import players.Player;
import players.Princess;
import players.Squire;
/**
 * introduction to the game 
 * @author Jhakon
 *
 */
public class GameDriver
{
	private static Scanner console = new Scanner(System.in);
/**
 * this is the main class that runs the program
 * the user chooses the amount of tiles
 * the larger the number of tiles the difficulty increases
 * user types in their name
 * User chooses a player 
 * @param args
 */
	public static void main(String[] args)
	{
		/*
		 * You should greet the user and gather all game related values before
		 * sending them to the game object below.
		 */

		System.out.println("\nWelcome to the Longest Adventure\n" + "********************************");
		System.out.println();
		
		//user enters number of tiles
		System.out.println("Please choose a number of tiles: ");
		int tileNumbers = console.nextInt();
		System.out.println();
		
		// clearing the buffer
		console.nextLine(); 

		//user enters name
		System.out.println("Please enter your name: ");
		String playerName = console.nextLine();
		System.out.println();

		//user chooses player type
		System.out.println("Please choose a player type (knight, princess, squire):\n"
				+ "Knight - Tough travelers that can weather any adversity!\n"
				+ "Princess - Smart and savy, a princess is never caught off guard!\n"
				+ "Squire - Squires have a knock for getting there quicker!\n");
		String playerType = console.nextLine();
		System.out.println();
		System.out.println();
		
		//display player type
		System.out.println(playerType);
		System.out.println();

		// send in the number of tiles and a new player object here
		Player player = null;

		//assigns the user to the player they choose
		if (playerType.equals("Knight"))
		{
			player = new Knight(playerName);
		} 
		else if (playerType.equals("Princess"))
		{
			player = new Princess(playerName);
		}
		else if (playerType.equals("Squire"))
		{
			player = new Squire(playerName);
		}

		Game game = new Game(tileNumbers, player);
		game.startGame();

		//close console
		console.close();
	}
}