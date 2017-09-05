package Package9;

public class Rectangle extends Shape{

	private double length, width;
	
	public Rectangle(String name, double length, double width, String color, double x, double y)
	{
		super(name, color, x, y);
		
		this.length = length;
		this.width = width;
	}
	
	public double area()
	{
		return width * length;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	
	
	public String toString()
	{
		return super.toString() + ", Area: " + area() + ", Length: " + length + ", Width: " + width;
	}
}

