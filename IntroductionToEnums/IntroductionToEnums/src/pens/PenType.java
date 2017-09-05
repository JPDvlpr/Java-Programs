package pens;

public enum PenType
{
	FOUNTAIN, ROLLER_BALL, BALL_POINT; // include a semi-colon

	public String toString()
	{
		String text = super.toString();

		// replaces underscore for space
		return text.toLowerCase().replace("_", " ");
	}
}
