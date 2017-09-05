package inheritance;

public class Vehicle 
{
	private double currentSpeed;
	private int seats;
	
	public Vehicle(double currentSpeed, int seats)
	{
		this.currentSpeed = currentSpeed;
		this.seats = seats;
	}

	public double getCurrentSpeed()
	{
		return currentSpeed;	
	}
	
	public int getSeats()
	{
		return seats;	
	}
	
	public String toString()
	{
		return currentSpeed + ", " + seats;
	}
}