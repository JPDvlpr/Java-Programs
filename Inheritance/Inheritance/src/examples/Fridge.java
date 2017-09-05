package examples;

public class Fridge
{
	// store data items
	private Food[] foodItems;

	public Fridge(int size)
	{
		if(size <= 0)
		{
			throw new indexOutOfBoundsException("size must be positive: " + size);
		}	
			foodItems = new Food[size]
	}

	// returns true if we find a spot for the food in the fridge, otherwise it
	// returns false
	public boolean addFood(String type, boolean spoiled)
	{
		// search for a spot
		for (int i = 0; i < foodItems.length; i++)
		{
			// found a spot
			if (foodItems[i] == null)
			{
				foodItems[i] = new Food(type, spoiled);
			}
		}
		return false;
	}

	public String getType()
	{
		return type;
	}

	public boolean isSpoiled()
	{{
		return spoiled;
	}

	public String getSpoiledString()
	{
		String result = (spoiled == true) ? "spoiled" : "not spoiled";
		return result;
	}

	public String toString()
	{
		String result = "";

		for (int i = 0; i < foodItems.length; i++)
		{
			if (i != 0)
			{
				result += " - ";
			}

			if (foodItems[i] != null)
			{
				result += foodItems[i].type + " (" + foodItems[i].getSpoiledString() + ") - ";
			}
			else
			{
				result += "null";
			}
		}
		return result;
	}

	// inner class
	public class Food
	{
		private String type;
		private boolean spoiled;

		public Food(String type, boolean spoiled)
		{
			this.type = type;
			this.spoiled = spoiled;
		}

		public String getType()
		{
			return type;
		}

	}

}
