package game;

import java.util.Random;

import players.Player;
import tiles.BasicTile;
import tiles.GrassTile;
import tiles.MudTile;
import tiles.RoadTile;
import tiles.TrapTile;
/**
 * this is the class with all main in game functions 
 * @author Jhakon
 *
 */
public class Game
{
	// stores tile objects
	private BasicTile[] tiles;
	Random rand = new Random();

	/*
	 * stores the index of player (which tile the player is located within
	 * inside the tiles array
	 */
	private int position = -1;
	private Player player;
	private int numTiles;
	private boolean gameOver = false;
	private int counter = 0;
/**
 * retrieves numTiles and players to be used in the following methods
 * @param numTiles
 * @param player
 */
	public Game(int numTiles, Player player)
	{
		this.player = player;
		this.numTiles = numTiles;
	}

	// public methods
/**
 * begins game with loop that is not false or (true)
 */
	public void startGame()
	{
		// this creates our array of tile objects
		buildTiles();

		/*
		 * The main game loop should be declared here. Each turn the player
		 * should move a random distance forward from 1 to maxSteps.
		 * 
		 * NOTE: maxSteps should be stored in the Player class and should be 2
		 * for Knights and 3 for squires or princesses.
		 */

		//counter used to show how many turns the user took
		while (!gameOver)
		{
			int steps = player.getSteps();
			int val = rand.nextInt(steps) + 1;
			movePlayer(val);
			counter++;
		}
	}
/**
 * returns player to be used
 * @return
 */
	public Player getPlayer()
	{
		return player;
	}
/**
 * moves the player and displays the steps taken
 * the position of the player within the array
 * the current fatigue
 * and the output the player says when stepping on a tile
 * @param distance
 */
	public void movePlayer(int distance)
	{
		/*
		 * This method moves the player the given distance. A positive value
		 * will move the player to the later indices in the tiles[] array, while
		 * a negative value will move the player back to lower indices.
		 * 
		 * NOTE: care must be taken that the index never falls outside the range
		 * 0 --> tiles.length - 1
		 */
		position = position + distance;

		//if the user wins display this message
		if (position >= tiles.length && player.getCurrentFatigue() < player.getMaximumFatigue())
		{
			System.out.println(printTiles());
			System.out.println();
			System.out.println("Congratulation " + player.getName() + " you have complete the journey!");
			System.out.println();
			System.out.println("Your journey took " + counter + " turns!");
			gameOver = true;
			return;
		}

		//displays the number of steps the user took (randomized by max steps)
		System.out.println("Player moves " + distance + " step(s) to a " + tiles[position].getType() + " tile.");
		System.out.println();

		// for (int i = 0; i < tiles.length; i++)
		// {
		// System.out.print(tiles[i].toString() + ", "); // M,G,T,M,T,G
		// }
		System.out.println(printTiles());
		System.out.println();
		
		//displays the current fatigue
		System.out.println("Player fatigue: " + player.getCurrentFatigue() + "/" + player.getMaximumFatigue());
		System.out.println();
		
		// Displays player message when stepping on tile
		tiles[position].visitTile(this); 
		System.out.println();
		System.out.println();

		//losing statement
		if (position < tiles.length && player.getCurrentFatigue() >= player.getMaximumFatigue())
		{
			System.out.println(printTiles());
			System.out.println();
			System.out.println("You lose");
			System.out.println();
			System.out.println("Your journey took " + counter + " turns!");
			gameOver = true;
			return;
		}
	}

	// private methods
	private void buildTiles()
	{
		/*
		 * This method should instantiate tile objects to fill the tiles[] array
		 * above. 10% of the tiles should be trap tiles, 20% mud, 40% grass and
		 * 30% road.
		 */
		tiles = new BasicTile[numTiles];

		// BasicTile newTiles = new BasicTile;

		for (int i = 0; i < numTiles; i++)
		{
			int n = rand.nextInt(10) + 1;

			//percentages that the player will land on this tile
			if (n >= 1 && n <= 4)
			{
				tiles[i] = new GrassTile();
			} else if (n > 7 && n <= 9)
			{
				tiles[i] = new RoadTile();
			} else if (n > 4 && n <= 7)
			{
				tiles[i] = new MudTile();
			} else if (n > 9)
			{
				tiles[i] = new TrapTile();
			}
		}
	}

	// prints out the tiles array along with the current player position
	private String printTiles()
	{
		String result = "[";

		for (int i = 0; i < tiles.length; i++)
		{
			if (i != 0)
			{
				result += ", ";
			}

			// player is in this tile
			if (position == i)
			{
				result += tiles[i].toString() + " - (player)";
			} else
			{
				result += tiles[i].toString();
			}
		}
		result += "]";

		if (position >= tiles.length)
		{
			result += " (player)";
		}

		return result;
	}
}