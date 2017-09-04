package players;
/**
 * child class princess extends Player class
 * @author Jhakon
 *
 */
public class Princess extends Player
{
	private static final int MAX_FATIGUE = 12;
	private static final int MAX_STEPS = 3;
/**
 * Princess method with parameter name, steps, max fatigue, and max steps in that order
 * @param name
 */
	public Princess(String name)
	{
		super(name, 0, MAX_FATIGUE, MAX_STEPS);
	}
/**
 * output when princess steps in mud
 */
	public void stepsInMud()
	{
		System.out.println("This mud is going to stain my dress!");
	};
/**
 * output when princess steps on grass
 */
	public void stepsOnGrass()
	{
		System.out.println("This grass feels great between my toes.");
	};
/**
 * output when princess steps on road
 */
	public void stepsOnRoad()
	{
		System.out.println("This road is dusty.");
	};
/**
 * output when princess steps on trap
 */
	public void stepsOnTrap()
	{
		System.out.println("This trap won't affect me!");
	};
}