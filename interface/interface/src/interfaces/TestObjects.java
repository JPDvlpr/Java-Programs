package interfaces;

public class TestObjects
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Bird jose = new Bird("blue", "bluejay");
		Candle lumere = new Candle(8,true);
		Cloud cloud = new Cloud("white", "cumulus");
		
		Object[] objects = {jose, lumere};
		
		for (int i = 0; i<objects.length;i++)
		{
			//we can only interact with methods from Object
			System.out.println(objects[i].toString());
		}
		
		//group my objects based on an interface
		Breathe[] breathers = {jose, lumere};
		
		for (int i = 0; i<breathers.length;i++)
		{
			//we can only interact with methods from Object
			breathers[i].produceCarbonDioxide();
		}
		
		//group my objects based on an interface
		Colorable[] colorObjects = {jose, cloud};
		
		for (int i = 0; i<colorObjects.length;i++)
		{
			//we can only interact with methods from Object
			System.out.println(colorObjects[i].getColor());
		}
		

	}

}
