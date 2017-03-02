
public class Player
{
	private String firstName;
	private String lastName;
	private int jerseyNumber;
	
	Player(String firstName, String lastName, int jerseyNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.jerseyNumber = jerseyNumber;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}

	public int getJerseyNumber() 
	{
		return jerseyNumber;
	}

	void display()
	{
		System.out.println(this.firstName + " " + this.lastName);
	}
}
