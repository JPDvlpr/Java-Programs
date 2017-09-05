package interfaces;

public class Cloud implements Colorable
{
	
	private String color;
	private String type;

	public Cloud(String color, String type)
	{
		super();
		this.color = color;
		this.type = type;
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
	
	public void setType(String type)
	{
		this.type = type;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
