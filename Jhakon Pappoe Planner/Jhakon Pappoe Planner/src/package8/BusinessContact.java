package package8;
/**
 * @author Jhakon
 * BusinessContact class extends the contact class
 */
public class BusinessContact extends Contact
{

	private String company, position, phoneNumber;
/**
 * gives default values for the business class
 */
	public BusinessContact()
	{
		this("", "", "", false, "", "", "");
	}
/**
 * @param firstName
 * @param lastName
 * @param email
 * @param gender
 * @param company
 * @param position
 * @param phoneNumber
 * business class inherits firstname, lastname, email, and gender
 * from parent class then adds its own company, position, and phone number
 */
	public BusinessContact(String firstName, String lastName, String email, boolean gender, String company,
			String position, String phoneNumber)
	{
		super(firstName, lastName, email, gender);
		this.company = company;
		this.position = position;
		this.phoneNumber = phoneNumber;
	}
/**
 * @return
 * creates a getCompany method and returns company
 */
	public String getCompany()
	{
		return company;
	}
/**
 * @return
 * new getPosition and returns position
 */
	public String getPosition()
	{
		return position;
	}
/**
 * @return
 * getPhoneNumber returns phoneNumber
 */
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void printContact()
	{
		
	}
/**
 * returns the superclass toString and adds additional fields post substring method
 */
	public String toString()
	{
		return super.toString() + ", Company: " + company + ", Position: " + position + ", Phone Number: "
				+ phoneNumber;
	}

}