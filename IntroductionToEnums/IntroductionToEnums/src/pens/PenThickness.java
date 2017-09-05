package pens;

public enum PenThickness
{
	// invoke our constructor with each of our enum valuds
	FINE(3), REGULAR(5), THICK(7);

	// fields (attributes)
	private int thicknessValue;

	// constructors
	private PenThickness(int thicknessValue)
	{
		this.thicknessValue = thicknessValue;
	}

	// methods
	public int getThicknessValue()
	{
		return thicknessValue;
	}
}
