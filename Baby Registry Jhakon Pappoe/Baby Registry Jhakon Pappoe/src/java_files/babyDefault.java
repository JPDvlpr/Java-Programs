package java_files;

/**
 * default baby class with main elements to be used in the driver class
 * 
 * @author Jhakon
 */
public class babyDefault
{
	private String babyName;
	private String city;
	private String state;
	private String frequency;

	/**
	 * constructors with the baby's name, city, state and number of name
	 * occurrences (frequencies)
	 * 
	 * @param babyName
	 * @param city
	 * @param state
	 * @param frequency
	 */
	public babyDefault(String babyName, String city, String state, String frequency)
	{
		this.babyName = babyName;
		this.city = city;
		this.state = state;
		this.frequency = frequency;
	}

	/**
	 * returns a getter for names
	 * 
	 * @return
	 */
	public String getNames()
	{
		return babyName;
	}

	/**
	 * returns a setter for names
	 * 
	 * @param babyName
	 */
	public void setName(String babyName)
	{
		this.babyName = babyName;
	}

	/**
	 * returns a getter for cities
	 * 
	 * @return
	 */
	public String getCities()
	{
		return city;
	}

	/**
	 * returns a setter for cities
	 * 
	 * @param city
	 */
	public void setCities(String city)
	{
		this.city = city;
	}

	/**
	 * returns a getter for states
	 * 
	 * @return
	 */
	public String getStates()
	{
		return state;
	}

	/**
	 * returns a setter for states
	 * 
	 * @param state
	 */
	public void setStates(String state)
	{
		this.state = state;
	}

	/**
	 * returns a getter for frequencies
	 * 
	 * @return
	 */
	public String getFrequencies()
	{
		return frequency;
	}

	/**
	 * returns a setter for frequencies
	 * 
	 * @param frequency
	 */
	public void setFrequencies(String frequency)
	{
		this.frequency = frequency;
	}
}