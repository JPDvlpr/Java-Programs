package interfaces;

public class Bird extends Object implements Breathe, Colorable
{
	//attributes
	private String color;
	private String type;

	public Bird(String color, String type)
	{
		super();
		this.color = color;
		this.type = type;
	}
	
	@Override
	public void consumeOxygen()
	{
		System.out.println("The bird consumes oxygen");
	}

	public String getColor()
	{
		return color;
	}


	public void setColor(String color)
	{
		this.color = color;
	}


	public String getType()
	{
		return type;
	}


	public void setType(String type)
	{
		this.type = type;
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
