package examples;

public class TestFridge
{

	public static void main(String[] args)
	{
		//create a fridge
		Fridge myFridge = new Fridge(5);
		
		//add a few items
		myFridge.addFood("piza", false);
		myFridge.addFood("mangos", false);
		myFridge.addFood("greek yogurt", false);
		myFridge.addFood("banana", false);
		
		System.out.println(myFridge.toString());
	}

}
