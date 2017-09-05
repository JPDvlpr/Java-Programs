package inheritance;

public class AirPlane extends Vehicle
{
	private int numWings;
	private boolean landingGear;
	
	public AirPlane(int numWings, boolean landingGear, double speed, int seats)
	{
		super(speed,seats);
		
		this.numWings = numWings;
		this.landingGear = landingGear;
	}
	public int getNumWings()
	{
		return numWings;
	}
	
	public boolean getLandingGear()
	{
		return landingGear;
	}
	
	public String toString()
	{
		return "Airplane- " + super.toString() + ", Wings: " + numWings + ", Landing Gear: " + landingGear;
	}
}
