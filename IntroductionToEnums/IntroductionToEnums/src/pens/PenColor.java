package pens;

public enum PenColor
{
	RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), WHITE(255, 255, 255);

	// fields - rgb values
	private int red; // 0-255
	private int green; // 0-255
	private int blue; // 0-255

	// constructors
	private PenColor(int red, int green, int blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	// methods
	public int getRed()
	{
		return red;
	}

	public int getGreen()
	{
		return green;
	}

	public int getBlue()
	{
		return blue;
	}

	public String toString()
	{
		return super.toString().toLowerCase() + "(" + red + ", " + green + ", " + blue + ")";
	}

}
