package players;
/**
 * Knight class that extends the parent class Player
 * @author Jhakon
 *
 */
public class Knight extends Player
{
	private static final int MAX_FATIGUE = 25;
	private static final int MAX_STEPS = 2;
/**
 * Knight method with parameter name, steps, max fatigue, and max steps in that order
 * @param name
 */
	public Knight(String name)
	{
		super(name, 0, MAX_FATIGUE, MAX_STEPS);
	}
/**
 * output when princess steps in mud
 */
	public void stepsInMud()
	{
		System.out.println("Mud, yuck, mud everywhere!");
	};
/**
 * output when princess steps on grass
 */
	public void stepsOnGrass()
	{
		System.out.println("This grass is slowing me down.");
	};
/**
 * output when princess steps on road
 */
	public void stepsOnRoad()
	{
		System.out.println("This road is more to my liking.");
	};
/**
 * output when princess steps on trap
 */
	public void stepsOnTrap()
	{
		System.out.println("Lucky my armor is on, ouch!");
	};
}