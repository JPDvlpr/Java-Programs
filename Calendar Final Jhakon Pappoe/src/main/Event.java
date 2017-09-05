/*
 * Michael Kolman
 * 6/9/17
 * Event.java
 * This class represents an Event object.  These events
 * can be stored in and removed from a text file.
 */
package main;

/**
 * This class represents an event object.  These events
 * can be stored in a text file in the form of a string.
 * 
 * @author Michael Kolman	
 * @version 1.0
 *
 */
public class Event extends CalendarRetrieve{

	//fields
	private String eventName; //name of event
	private String summary; //description of the event
	private double time; //store time as an int? military time?
	private double length; //length of event in hours
	
	//if the user has all the info
	/**
	 * This is a constructor for the event object.
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @param time
	 * @param length
	 * @param name
	 * @param summary
	 */
	public Event(int day, int month, int year, double time, double length, String eventName, String summary)
	{	
		//inheriting calendar key values
		super(day,month,year);
		this.time = time;
		this.eventName = eventName;
		this.summary = summary;
		//length
	}

	//getters and setters
	public double getTime()
	{
		return time;
	}

	public void setTime(int time) 
	{
		this.time = time;
	}

	public double getLength() 
	{
		return length;
	}

	public void setLength(double length) 
	{
		this.length = length;
	}

	public String getName() 
	{
		return eventName;
	}

	public void setName(String eventName) 
	{
		this.eventName = eventName;
	}

	public String getSummary() 
	{
		return summary;
	}

	public void setSummary(String summary) 
	{
		this.summary = summary;
	}

	
	//how the event will be displayed in the file or on the console.
	public String toString()
	{
//		String result = "Date: " +  date + "\n Time: " + time + " - "
//				+ (time + length) + "\n Name: " + name + "\n Summary: " + summary;
		
		return "Testing event";
	}
}