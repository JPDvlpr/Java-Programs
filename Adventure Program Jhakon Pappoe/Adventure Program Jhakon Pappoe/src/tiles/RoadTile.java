package tiles;

import game.Game;
import players.Player;
import players.Squire;
/**
 * RoadTile that extends BasicTile retrieves ENUM ROAD from tiletype class 
 * @author Jhakon
 *
 */
public class RoadTile extends BasicTile
{
	public RoadTile()
	{
		super(TileType.ROAD);
	}

	/**
	 * creates a player object and creates fatigue which pulls
	 * getCurrentFatigue method from the roady object
	 * if the player is a squire the fatigue increments
	 */
	@Override
	public void visitTile(Game game)
	{
		Player roady = game.getPlayer();
		int fatigue = roady.getCurrentFatigue();
		roady.setCurrentFatigue(fatigue);
		if (roady instanceof Squire)
		{
			fatigue++;
		}
		roady.stepsOnRoad();
	}
/**
 * returns the char R instead of the string road
 */
	public String toString()
	{
		return "R";
	}
}