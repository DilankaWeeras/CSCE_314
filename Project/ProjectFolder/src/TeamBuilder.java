import java.util.ArrayList;

import java.util.*;

public class TeamBuilder
{
	private List<CSCE314Student> StudentList; // List of the students
	private List<List<CSCE314Student>> PartnerList; // added new to fill in missing requirements, pass by value is issue 
	private Utility fileReader; // Utility used to read the files
	private List<String> errorCount; // used to hold list of errors

	/*
	Default constructor for TeamBuilder
	Instatiates all private varaibles
	*/
	TeamBuilder()
	{
		StudentList = new ArrayList<>();
		PartnerList = new ArrayList<>();
		fileReader = new Utility();
		errorCount = new ArrayList<>();
	}
	/*
	Grabs Students from the file and will place them in a list
	Will handle any errors encoutered in the Strings located in the file
	*/
	public void importStudents(String fileName)
	{
		fileReader.readFile(fileName); // use Utility to read the file
		CSCE314Student tempStudent; // temp Student to hold values, will be created new every time
		try
		{
			for(int i = 1; i < fileReader.length(); i++) // grab lines through the file reader
			{
				tempStudent = new CSCE314Student(); // needed to change from resetStudent to new Student
				try
				{
					tempStudent.setFName(fileReader.getFNameUtility(i));
					tempStudent.setLName(fileReader.getLNameUtility(i));
					tempStudent.setUIN(fileReader.getUINUtility(i));
					tempStudent.setRank(fileReader.getRankUtility(i));
					tempStudent.setJavaKnowlege(fileReader.getJavaKnowlegeUtility(i));
					tempStudent.setSection(fileReader.getSectionUtility(i));
					tempStudent.setPartner(false);
					//System.out.println(tempStudent.toString()); // used to report each Student to the terminal
					StudentList.add(tempStudent);
				}
				catch(Exception ls) // in try block to catch the error and list in the errorCount
				{
					System.out.println("Failed to import " + fileReader.getFNameUtility(i) + " " + fileReader.getLNameUtility(i)); //early report errors to terminal
					errorCount.add(fileReader.getFNameUtility(i) + " " + fileReader.getLNameUtility(i) + " " + ls); // makes above line unnecessary
				}                
			}
		}
		catch(Exception l) // this will occor if the file is not found
		{
			System.out.println("Failed to import Students to memory.");
			errorCount.add("" + l); //file error reported
		}
	}
	/*
	Did not sort students by section to save memory and reduce complexity of the program.
	Less memory intensive.
	Will sort the Students by JavaKnowlege.
	Section difference handled in seperate method
	This is a bubblesort
	*/
	public void sortStudents()
	{
		CSCE314Student tempStudent;        
		for(int i = StudentList.size()-1; i > 0; i--) //start at the back of the list
		{
			for(int j = 0; j < i; j++) //Start at front until hit i
			{
				if(JavaKnowlegeComparator.compareJavaKnowlege(StudentList.get(j), StudentList.get(j+1)) == 1) //compare
				{
					tempStudent = StudentList.get(j); // bubble sort
					StudentList.set(j, StudentList.get(j+1));
					StudentList.set(j+1, tempStudent);
				}
			}
		}
	}
	/*
	Sorts the Students into Partnerships
	Does not sort by Section but will not put two students from different sections in the same group
	*/
	public void PartnerStudent()
	{
		int j = StudentList.size()-1;
		while(true)
		{
			for(int i = 0; i < j; i++)
			{
				/*
				Checks for section, if same then checks if Partner. if not then it will add them to PartnerList
				No cost to memory as no new Student is made
				If a Student from Studentlist is deleted it will be removed by Partnerlist
				the boolean is not reset unfortunantly
				*/
				if(StudentList.get(i).getSection() == StudentList.get(j).getSection() && !StudentList.get(i).getPartner() && !StudentList.get(j).getPartner())
				{
					PartnerList.add(makePartnerList(StudentList.get(i), StudentList.get(j)));
					StudentList.get(i).setPartner(true);
					StudentList.get(j).setPartner(true);
					break;
				}
			}
			if(j == 0) {break;}
			j--;
		}
	}
	/*
	Helper function to make a List of Students
	Placed into PartnerList
	*/
	private List<CSCE314Student> makePartnerList(CSCE314Student s1, CSCE314Student s2)
	{
		List<CSCE314Student> partners = new ArrayList<CSCE314Student>();
		partners.add(s1);
		partners.add(s2);
		return partners;
	}
	//Testing method, not used
	public CSCE314Student getStudent(int line)
	{
		return StudentList.get(line); // returns the student
	}
	/*
	toString override will return String of all Students.
	*/
	@Override
	public String toString()
	{
		String send = "";
		for(int i = 0; i < StudentList.size(); i++)
		{
			send += StudentList.get(i).toString() + "\n";
		}
		return send;
	}
	/*
	Returns a String of all Partners following the template
	*/
	public String printPartners()
	{
		String send = "";
		for(int i = 0; i < PartnerList.size(); i++) //iterate through partnerlist
		{
			send += PartnerList.get(i).get(0).getSection() + " - ";
			for(int j = 0; j < PartnerList.get(i).size(); j++)
			{
				send += PartnerList.get(i).get(j).getFName() + " "
						+ PartnerList.get(i).get(j).getLName() + " (" 
						+ PartnerList.get(i).get(j).getUIN() + ") ("
						+ PartnerList.get(i).get(j).getJavaKnowledge() + ") "; 
				if(j == 0) { send += "-- ";}
			}
			send += "\n";
		}
		send += "\nSubstitute Students:\n";
		for(int i = 0; i < StudentList.size(); i++) // Iterate through StudentList
		{
			if(!StudentList.get(i).getPartner()) //checks if the student has a partner
			{
				send += StudentList.get(i).getSection() + " - "
						+ StudentList.get(i).getFName() + " "
						+ StudentList.get(i).getLName() + " (" 
						+ StudentList.get(i).getUIN() + ") ("
						+ StudentList.get(i).getJavaKnowledge() + ")\n"; 
			}
		}
		return send; // will send the Partners then the Subs
	}
	/*
	Returns a String of the errors encountered
	*/
	public String errorToString()
	{
		String send = "";
		for(int i = 0; i < errorCount.size(); i++)
		{
			send += errorCount.get(i) + "\n";
		}
		return send;
	}
	/*
	Calls Utility to write to the file "results.txt"
	*/
	public void writeResults()
	{
		fileReader.writeResults(printPartners());
	}

}