package tiles;

import game.Game;
import players.Player;
/**
 * MudTile that extends BasicTile retrieves ENUM MUD from tiletype class 
 * @author Jhakon
 *
 */
public class MudTile extends BasicTile
{
	public MudTile()
	{
		super(TileType.MUD);
	}

	/**
	 * creates a player object and creates fatigue which pulls
	 * getCurrentFatigue method from the muddy object
	 */
	@Override
	public void visitTile(Game game)
	{
		Player muddy = game.getPlayer();
		int fatigue = muddy.getCurrentFatigue();
		fatigue = fatigue + 2;
		muddy.setCurrentFatigue(fatigue);
		muddy.stepsInMud();
	}
/**
 * returns the char M instead of the string mud
 */
	public String toString()
	{
		return "M";
	}
}