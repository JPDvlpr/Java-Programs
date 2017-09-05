package Package9;

public class Shape {
	
	private double x, y;
	private String color, name;
	
	public Shape(String name, String color, double x, double y)
	{
		this.name = name;
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public String getColor(){
		return color;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public String toString()
	{
		return "Name: "+ name + ", Color: " + color + ", X-Value: " + x + ", Y-Value: " + y;
		
	}
}
