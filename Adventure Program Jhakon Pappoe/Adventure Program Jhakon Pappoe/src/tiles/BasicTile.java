package tiles;

import game.Game;
/**
 * abstract BasicTile class
 * @author Jhakon
 *
 */
public abstract class BasicTile
{
	/**
	 * public enum with GRASS, MUD, ROAD, TRAP
	 * @author Jhakon
	 *
	 */
	public enum TileType
	{
		GRASS, MUD, ROAD, TRAP
	}

	private TileType type;
/**
 * invoked method type
 * @param type
 */
	public BasicTile(TileType type)
	{
		this.type = type;
	}
/**
 * public getter that returns type
 * @return
 */
	public TileType getType()
	{
		return type;
	}
/**
 * Basic tile toString
 */
	public String toString()
	{
		return type.toString().substring(0, 1);
	}
/**
 * abstract visitTile method with Game class parameter
 * does not return anthing
 * @param game
 */
	public abstract void visitTile(Game game);
}
