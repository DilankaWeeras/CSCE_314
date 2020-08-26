public abstract class Person
{
	private String firstName; // vairable first name
	private String lastName; // vairable last name

	/*
    Default Constructor for person
	 */
	Person()
	{
		firstName = "empty";
		lastName = "empty";
	}
	/*
    Constructor for Person
    assigns the first and last name for the person
	 */
	Person(String newFName, String newLName)
	{
		firstName = newFName;
		lastName = newLName;
	}
	/*
    Accsessor for first name
    Returns String firstname
	 */
	public String getFName() {return firstName;}
	/*
    Acessor for last name
    returns String last name
	 */
	public String getLName() {return lastName;}

	/*
    Mutator for first name
    method pararameter is String first name
	 */
	protected void setFName(String newFName) {firstName = newFName;}
	/*
    Mutator for the last name
    method paramater is String last name
	 */
	protected void setLName(String newLName) {lastName = newLName;}

	/*
    Mutator for resesting the Person.
    Input Object Person and will be given an empty first and last name
	 */
	public static void resetPerson(Person x)
	{
		x.setFName("empty");
		x.setLName("empty");
	}
	/*
    compare to another person
    NOT implemented
	 */
	public int compareTo(Person x)
	{
		return 0;
	}
	/*
    toString Override, will print the first name and the last name
    returns String
	 */
	@Override
	public String toString()
	{
		return "Name: " + getFName() + " " + getLName();
	}
}