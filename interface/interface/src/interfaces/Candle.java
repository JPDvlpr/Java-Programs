package interfaces;

public class Candle
{
	private double height;
	private boolean isLit;
	
	

	public Candle(double height, boolean isLit)
	{
		super();
		this.height = height;
		this.isLit = isLit;
	}

	@Override
	public void consumeOxygen()
	{
		if(isLit)
		{
			System.out.println("The candle is burning and consuming O2");
		}
		else
		{
			System.out.println("Why did you call this method?");
		}
		}
	
	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public boolean isLit()
	{
		return isLit;
	}

	public void setLit(boolean isLit)
	{
		this.isLit = isLit;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
