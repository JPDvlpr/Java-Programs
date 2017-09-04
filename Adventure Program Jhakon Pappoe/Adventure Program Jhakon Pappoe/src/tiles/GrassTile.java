package tiles;

import game.Game;
import players.Player;
/**
 * GrassTile that extends BasicTile retrieves ENUM GRASS from tiletype class 
 * @author Jhakon
 *
 */
public class GrassTile extends BasicTile
{
	public GrassTile()
	{
		super(TileType.GRASS);
	}

	/**
	 * creates a player object and creates fatigue which pulls
	 * getCurrentFatigue method from the grassy object
	 */
	@Override
	public void visitTile(Game game)
	{
		Player grassy = game.getPlayer();
		int fatigue = grassy.getCurrentFatigue();
		fatigue++;
		grassy.setCurrentFatigue(fatigue);
		grassy.stepsOnGrass();
	}
/**
 * returns the char G instead of the string grass
 */
	public String toString()
	{
		return "G";
	}
}
