public class CSCE314Student extends Student
{
	private int JavaKnowledge; //integer Java Knowlege
	private int section; // integer section
	private boolean partner; // boolean for has a partner

	/*
    Default constructor for CSCE Student
    Will grab name, UIN, and Rank from parent class
    sets the JavaKnowlege and section to zero
    sets has partner to false
	 */
	CSCE314Student()
	{
		super();
		JavaKnowledge = 0;
		section = 0;
		partner = false;
	}
	/*
    Constructor for CSCE Student
    Will grab name, UIN, and Rank from parent class
    sets the JavaKnowlege and section to zero

    input firstname, lastname, UIN, Rank, Java Knowledge, Section

    sets has partner to false
	 */
	CSCE314Student(
			String newFName,
			String newLName,
			String newUIN,
			Rank newRank,
			int newJavaKnowlege,
			int newSection
			)
	{
		super(newFName, newLName, newUIN, newRank);
		JavaKnowledge = newJavaKnowlege;
		section = newSection;
		partner = false;
	}
	/*
    Accessor for Java Knowlege
    returns int for JavaKnowlegde
	 */
	public int getJavaKnowledge()
	{
		return JavaKnowledge;
	}
	/*
    Accessor for Section
    returns int for section
	 */
	public int getSection()
	{
		return section;
	}
	/*
    Accessor for has partner
    returns boolean for has partner
	 */
	public boolean getPartner()
	{
		return partner;
	}

	/*
    Mutator for set Java Knowledge
    input an int for Java Knowledge
	 */
	public void setJavaKnowlege(int newJavaKnowlege)
	{
		JavaKnowledge = newJavaKnowlege;
	}
	/*
    Mutator for set Section
    input an int for Section
	 */
	public void setSection(int newSection)
	{
		section = newSection;
	}
	/*
    Mutator for set Partner
    input a boolean for partner
	 */
	public void setPartner(boolean partnered)
	{
		partner = partnered;
	}
	/*
    Mutator for CSCE Student
    resets CSCE Student to default constructor values
    Java Knowlege will be 0
    Section will be 0
    this Student will not have a partner
	 */
	public void resetCSCE314Student()
	{
		resetStudent(this);
		setJavaKnowlege(0);
		setSection(0);
		setPartner(false);
	}
	/*
    toString override for CSCE Student

    first name last name
    UIN: this UIN
    Rank: this rank
    Java Knowledge: this java knowledge
    Section: this section

    returns a String    
	 */
	@Override
	public String toString() {
		return super.toString() + "\nJava Knowledge: " + getJavaKnowledge() + "\nSection: " + getSection() + "\n";
	}
}