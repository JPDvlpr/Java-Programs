package pens;

public class Pen
{
	// constants
	private PenType type; // ball-point, roller-ball, fountain
	private PenThickness thickness; // fine, regular, thick
	private PenColor color; // red,white,green

	public Pen(PenType type, PenThickness thickness, PenColor color)
	{
		// could we use our setters here?
		this.type = type;
		this.thickness = thickness;
		this.color = color;
	}

	public PenType getType()
	{
		return type;
	}

	public void setType(PenType type)
	{
		this.type = type;
	}

	public PenThickness getThickness()
	{
		return thickness;
	}

	public void setThickness(PenThickness thickness)
	{
		this.thickness = thickness;
	}

	public PenColor getColor()
	{
		return color;
	}

	public void setColor(PenColor color)
	{
		this.color = color;
	}

	public String toStirng()
	{
		// for equals, "red fine point ball-point pen"
		return color + " " + thickness.toString() + "(" + thickness.getThicknessValue() + ")" + " point "
				+ type.toString() + " pen";
	}
}