package package6;

import java.util.Random;
/**
 * This class represents a coin object. You can flip it!
 * @author Jhakon Pappoe
 * version 1.0
 */
public class Coin 
{
	private boolean state;
	private Random rand = new Random();
	/**
	 * This is a getter for the state of the coin
	 * rather heads or tails.
	 * 
	 * @return returns coin state (heads-tails)
	 */
	public boolean getState()
	{
		return state;
	/**
	 * This flips the coin 
	 * and randomly lands on current side of coin.
	 * 
	 */
	}	
	public void flip()
	{
		state = rand.nextBoolean();
	}
	/**
	 * This is set to return no statement.
	 * This is left for the CoinMain class.
	 */
	public String toString()
	{
		return null;
	}
}
