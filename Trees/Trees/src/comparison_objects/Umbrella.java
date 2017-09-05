package comparison_objects;

public class Umbrella implements Comparable<Umbrella>
{

	// fields
	private String color;
	private int sizeRadius;
	private boolean retractable;
	private double price;

	public Umbrella(String color, int sizeRadius, boolean retractable, double price)
	{
		this.color = color;
		this.sizeRadius = sizeRadius;
		this.retractable = retractable;
		this.price = price;
	}

	@Override
	public int compareTo(Umbrella other)
	{
		// ,ulti level sort
		int colorCompare = this.color.compareTo(other.color);

		if (colorCompare != 0)
		{
			return colorCompare;
		} 
		else
		{

			//sort based on sizeRadius
			
			// sort base on color?
			// return this.color.compareTo(other.color);
			// sort based on price
			// return (int)(this.price - other.price);

			// sorting based on radius
			// return this.sizeRadius - other.sizeRadius;

			if (this.sizeRadius < other.sizeRadius)
			{
				return -1;
			}

			else if (this.sizeRadius > other.sizeRadius)
			{
				return 1;
			} else // if(this.sizeRadius == other.sizeRadius)

			{
				return 0;
			}
		}
	}

	@Override
	public String toString()
	{
		return "Umbrella [color=" + color + ", sizeRadius=" + sizeRadius + ", retractable=" + retractable + ", price="
				+ price;
	}

}
