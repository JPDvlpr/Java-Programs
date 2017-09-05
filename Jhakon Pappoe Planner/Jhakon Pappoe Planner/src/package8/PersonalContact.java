package package8;

import java.time.LocalDate;
import java.time.Month;
/**
 * @author Jhakon
 * creates my PersonalContact class
 * has a private address and a
 * LocalDate birthday
 */
public class PersonalContact extends Contact
{
	private String address;
	//Example parameter >>>>> LocalDate.of(2010, Month.MARCH, 16)
	LocalDate birthDate = LocalDate.ofEpochDay(365);
/**
 * fills the class with default parameters
 */
	public PersonalContact()
	{
		this("", "", "", false, LocalDate.now(), "");
	}
/**
 * @param firstName
 * @param lastName
 * @param email
 * @param gender
 * @param birthDate
 * @param address
 * inherits super constructors and adds birthday and address 
 */
	public PersonalContact(String firstName, String lastName, String email, boolean gender, LocalDate birthDate,
			String address)
	{
		super(firstName, lastName, email, gender);
		this.birthDate = birthDate;
		this.address = address;
	}
/**
 * @return
 * getBirthDate returns birthDate
 */
	public LocalDate getBirthDate()
	{
		LocalDate birthDate = LocalDate.ofEpochDay(365);
		return birthDate;
	}
/**
 * @return
 * getAddress returns address
 */
	public String getAddress()
	{
		return address;
	}
/**
 * super class toString followed by perosnal toString
 */
	public String toString()
	{
		return super.toString() + ", Birth Date: " + birthDate + ", Address: " + address;
	}

}
