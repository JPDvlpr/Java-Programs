package package8;
/**
 * @author Jhakon
 * parent class to all that inherits
 */
public class Contact
{
	private String firstName, lastName, email;
	private boolean gender;

/**
 * 
 * @param firstName
 * @param lastName
 * @param email
 * @param gender
 * creates the contact with constructors
 */
	public Contact(String firstName, String lastName, String email, boolean gender)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;	
	}
/**
 * 
 * @return
 * concatenates the first and last name
 */
	public String getName()
	{
		return firstName + " " + lastName;
	}
/**
 * 
 * @return
 * email method for personal and business
 */
	public String getEmail()
	{
		return email;
	}
/**
 * 
 * @return
 * gets the gender True = Male and False = Female
 */
	public boolean getGender()
	{
		return gender;
	}

	public void printContact()
	{

	}
/**
 * concatenates name, email, and gender.
 * The subclasses will use this in addition
 * to their substring
 */
	public String toString()
	{
		return "Name: " + getName() + ", Email: " + email + ", Gender: " + gender;
	}

}
