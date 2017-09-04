package players;
/**
 * Abstract player class with option knight, princess, and squire
 * @author Jhakon
 *
 */
public abstract class Player
{
	private String name;
	private int currentFatigue, maximumFatigue, steps;
/**
 * user input name, current fatigue, maximum fatigue, and steps
 * @param name
 * @param currentFatigue
 * @param maximumFatigue
 * @param steps
 */
	public Player(String name, int currentFatigue, int maximumFatigue, int steps)
	{
		this.name = name;
		this.currentFatigue = currentFatigue;
		this.maximumFatigue = maximumFatigue;
		this.steps = steps;
	}

	/*
	 * Player objects will need to manage: name: the players name fatigue: the
	 * players current and maximum fatigue (a player loses when current ==
	 * maximum) steps: the maximum number of steps a player can take (based on
	 * sub class)
	 */
/**
 * getter to be called that returns name
 * @return
 */
	public String getName()
	{
		return name;
	}
/**
 * getter to be called that returns currentFatigue
 * @return
 */
	public int getCurrentFatigue()
	{
		return currentFatigue;
	}
/**
 * sets current fatigue
 * @param currentFatigue
 */
	public void setCurrentFatigue(int currentFatigue)
	{
		this.currentFatigue = currentFatigue;
	}
/**
 * sets maximum fatigue
 * @return
 */
	public int getMaximumFatigue()
	{
		return maximumFatigue;
	}
/**
 * getter to be called that returns steps
 * @return
 */
	public int getSteps()
	{
		return steps;
	}
/**
 * toString returns the name, current fatigue, maximum steps, and the steps.
 */
	public String toString()
	{
		return "Name: " + getName() + ", Current Fatigue: " + getCurrentFatigue() + ", Maximum Fatigue: "
				+ getMaximumFatigue() + "Steps: " + getSteps();
	}
/**
 * steps in mud abstract method to be called in each player class
 */
	public abstract void stepsInMud();
/**
 * steps on grass abstract method to be called in each player class
 */
	public abstract void stepsOnGrass();
/**
 * steps on road abstract method to be called in each player class
 */
	public abstract void stepsOnRoad();
/**
 * steps on trap abstract method to be called in each player class
 */
	public abstract void stepsOnTrap();
}
