package players;
/**
 * squire player extends Player parent class
 * @author Jhakon
 *
 */
public class Squire extends Player
{
	private static final int MAX_FATIGUE = 15;
	private static final int MAX_STEPS = 3;
/**
 * Squire method with parameter name, steps, max fatigue, and max steps in that order
 * @param name
 */
	public Squire(String name)
	{
		super(name, 0, MAX_FATIGUE, MAX_STEPS);
	}
/**
 * output when squire steps in mud
 */
	public void stepsInMud()
	{
		System.out.println("I grew up in the mud, this won't affect me!");
	};
/**
 * output when squire steps on grass
 */
	public void stepsOnGrass()
	{
		System.out.println("I love the open grassy fields.");
	};
/**
 * output when squire steps on road
 */
	public void stepsOnRoad()
	{
		System.out.println("I wonder how long this road will go on.");
	};
/**
 * output when squire steps on trap
 */
	public void stepsOnTrap()
	{
		System.out.println("Ugh a trap!");
	};
}