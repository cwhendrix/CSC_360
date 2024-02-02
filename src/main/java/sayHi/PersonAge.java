package sayHi;

public class PersonAge
{
	String fname;
	String lname;
	int age;
	
	/**
	 * @param firstName - First Name
	 * @param lastName - Last Name
	 * @param age   - Age in years
	 */
	public PersonAge(String firstName, String lastName, int age)
	{
		super();
		this.fname = firstName;
		this.lname = lastName;
		this.age = age;
	}

	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lname = lname;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "Person: fname=" + fname + ", lname=" + lname + ", age=" + age;
	}
	
	public PersonAge makePerson(PersonAge that) throws UnderAgeException
	{
		if (this.age < 18 || that.age < 18) {
			throw new UnderAgeException();
		}
		PersonAge child = new PersonAge(this.fname, that.getLname(), 0);
		return child;
	}
	
	
	public static void main(String[] args)
	{
		PersonAge R = new PersonAge("Romeo", "Montague", 15);
		
		System.out.println(R);
	}
	
	
	
	
}
