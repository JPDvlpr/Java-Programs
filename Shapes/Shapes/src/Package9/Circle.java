package Package9;

public class Circle extends Shape
{	
	private double radius;
	
	public Circle()
	{
		this("", 0.0, "", 0.0, 0.0);
	}
	
	public Circle(String name, double radius, String color, double x, double y)
	{
		super(name, color, x, y);
		this.radius = radius;
	}
	
	public double area()
	{
		return (radius*Math.pow(3.14, 2));
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public String toString()
	{
		return super.toString() + ", Area: " + area() + ", Radius: " + radius;
	}
}
