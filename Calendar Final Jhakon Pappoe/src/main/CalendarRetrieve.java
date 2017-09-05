package main;

/**
 * getters and setters class
 * also has my private data fields
 * to be used throughout my program
 * @author Jhakon
 *
 */
public class CalendarRetrieve
{
	//represents the day
	private int day;
	// represents the month (1-12)
	private int month;
	// represents the year
	private int year;
	
	/**
	 * day, month, year retrieve constructor
	 * @param day
	 * @param month
	 * @param year
	 */
	public CalendarRetrieve(int day, int month, int year)
	{
		this.day = day;
		this. month = month;
		this.year = year;
	}

	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getDay()
	{
		return day;
	}
	
	public void setDay()
	{
		this.day = day;
	}
}
