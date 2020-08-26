public class Student extends Person
{

	private String UIN; // UIN of the student
	private Rank studentRank; // Year classification of the Student
	//private int studentRank; Used previously before ENUM was understood
	//Realized that the enum needed its own methods.

	/*
    Defult Constructor for Student
    Use Parent class to assign name
    Assigns UIN and Rank
	 */
	Student()
	{
		super();
		UIN = "empty";
		studentRank = Rank.FRESHMAN;
		//studentRank = Rank.FRESHMAN;
	}
	/*
    Constructor for Student
    Assigns name UIN and Rank
	 */
	Student(String newFName, String newLName, String newUIN, Rank newRank)
	{
		super(newFName, newLName);
		UIN = newUIN;
		studentRank = newRank;
	}
	/* 
    Accessor for UIN
    returns String UIN
	 */
	public String getUIN()
	{
		return UIN;
	}
	/*
    Accessor for Student Rank
    returns Rank enum for studentRank
	 */
	public Rank getStudentRank()
	{
		return studentRank;
	}
	/*
    Mutator for UIN
    input a String for new UIN
	 */
	public void setUIN(String newUIN)
	{
		UIN = newUIN;
	}
	/*
    Mutator for Students Rank
    input a Rank enum
	 */
	public void setRank(Rank newRank)
	{
		studentRank = newRank;
	}
	/*
    Resests the student to empty values
    returns the state to that of default constructor
	 */
	public static void resetStudent(Student x)
	{
		x.setFName("empty");
		x.setLName("empty");
		x.setUIN("empty");
		//x.setRank(Rank.FRESHMAN);
		x.setRank(Rank.FRESHMAN);
	}
	/*
    toString override for Student
    uses parent class for first and last name
    prints the UIN and the Rank on new lines
    returns string
	 */
	@Override
	public String toString()
	{
		return super.toString() + "\nUIN: " + getUIN() + " \nRank: " + getStudentRank();
	}

}