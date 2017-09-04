package tiles;

import game.Game;
import players.Player;
import players.Princess;
/**
 * GrassTile that extends BasicTile retrieves ENUM GRASS from tiletype class 
 * @author Jhakon
 *
 */
public class TrapTile extends BasicTile
{
	public TrapTile()
	{
		super(TileType.TRAP);
	}

	/**
	 * creates a player object and creates fatigue which pulls
	 * getCurrentFatigue method from the trappy object
	 * if the player is not a princess the fatigue increases by 2
	 * the trap moves a player back one spot in the array
	 */
	@Override
	public void visitTile(Game game)
	{
		Player trappy = game.getPlayer();
		int fatigue = trappy.getCurrentFatigue();
		if (!(trappy instanceof Princess))
		{
			fatigue = fatigue + 2;
		}
		game.movePlayer(-1);
		trappy.stepsOnTrap();
		trappy.setCurrentFatigue(fatigue);

	}
	/**
	 * returns the char T instead of the string trap
	 */
	public String toString()
	{
		return "T";
	}
}
