package examples;

public class Point
{
	//instance fields
	private double x;
	private double y;
	
	//static fields
	private static int pointCount; //keeps track of the number of points created
	private static final int MAX_POINTS = 1000;
	
	//constructors
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
		//increment the number of points created
		pointCount++;
	}
	
	//methods
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public String toString()
	{
		//call a static method
		System.out.println(getPointCount());
		
		//refer to a static field
		System.out.println(pointCount);
				
		return "x: " + x + ", y: " + y;
	}
	
	//static methods
	
	//this method is a static context
	public static void foo()
	{
		//Rule: cannot access non-static fields, or non-static methods
		//System.out.println("x: " + x + ", y: " + y);
		
		//System.out.println(toString());
		
		//call a static method
		System.out.println(getPointCount());
		
		//refer to a static field
		System.out.println(pointCount);
		
	}
	
	public static int getPointCount()
	{
		return pointCount;
	}
	
	public static boolean isOrigin(Point point)
	{
		//This boolean method is a replicate of your intro I couldn't find the mistake.
		if(point.x = 0.0 && point.y == 0.0)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}

}
