package Package9;

public class TestCircle {
	
	public static void main(String[] args)
	{
		Circle first = new Circle("Circle1", 2, "Green", 1, 1);
		Circle second = new Circle("Circle2", 2, "Blue", 1, 1);
		Rectangle third = new Rectangle("Rect3", 2, 4, "Yellow", 1, 1);
		Rectangle fourth = new Rectangle("Rect4", 2, 4, "Red", 1, 1);

		Shape[] shape = {first,second,third,fourth};		
		for(int i=0;i<shape.length;i++)
		{
			System.out.println(shape[i].toString());
		}
	}
	
}
