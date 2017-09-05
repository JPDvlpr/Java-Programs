package examples;

public class TestPoint
{
	public static void main (String[] args)
	{
		Point first = new Point(10.0,10.0);
		Point second = new Point(20.0,20.0);
		Point origin = new Point(0.0,0.0);

		
		System.out.println(first);
		System.out.println(second);
		
		//we dont need an object to invoke static methods
		System.out.println("Origin? " + Point.isOrigin(first));
		System.out.println("Origin? " + Point.isOrigin(origin));
		
		//you can use an object to invoke static methods, but this is discouraged!
		System.out.println("Origin? " + first.isOrigin(origin));
		
		//accessing a static method in a static way ClassName.staticMethodName()
		
		System.out.println("Points created: " + Point.getPointCount());
		
		Point.foo();
	}

}
