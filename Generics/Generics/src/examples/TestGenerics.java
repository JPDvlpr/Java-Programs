package examples;

public class TestGenerics
{

	public static void main(String[] args)
	{
		stringStorage message = new stringStorage("Hello!");
		integerStorage number = new integerStorage(42);
		
		System.out.println(message.getData().toString());
		System.out.println(number.getData());

		objectStorage storage1 = new objectStorage("Hello");
		objectStorage storage2 = new objectStorage(42);
		
		String hiddenValue = (String)storage1.getData();
		String hiddenValue2 = (String)storage2.getData();

		System.out.println(hiddenValue.toUpperCase().toString());
		System.out.println(hiddenValue2.toUpperCase().toString());

		//using generics here
		DataStorage<String> storage3 = new DataStorage<String>("Hello");
		DataStorage<Integer> storage4 = new DataStorage<Integer>(42);
		DataStorage<Robot> storage5 = new DataStorage<Robot>(new Robot());
		
		//retrieve our values using strong typing
		System.out.println(storage3.getData().toUpperCase());
		System.out.println(storage4.getData().intValue());
		
		Pair<Integer, Integer> parts = getDivisionParts(13,10);
		System.out.println("quotient: " + parts.getFirst());
		System.out.println("remainder: " + parts.getSecond());
		
	}
	
	public static Pair<Integer, Integer> getDivisionParts(int num, int den)
	{
		return new Pair<Integer, Integer>(num / den, num % den);
	}

}
