import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Utility
{
	private List<List<String>> records; // records hold the Information of the line read
	static Scanner sc = new Scanner(System.in); // Scanner to read the system in, used in previous iterations of the code
												// but not necessary

	public boolean readFile(String fileName)
	{
		// try catch to find the errors, catch in this class bu recorded TeamBuilder
		try {
			records = new ArrayList<>(); //init for records
			Scanner scanner = new Scanner(new File(fileName)); //Scanner for the file.csv

			while(scanner.hasNextLine()) // till EOF
			{
				records.add(getRecordFromLine(scanner.nextLine())); // Will add List of Strings to record using helper
			}
			return true;
		}
		catch(Exception e)
		{
			System.out.println("File was not found."); // print to ternimal
			return false;
		}
	}
	/*
	Private helper function for readfile
	Creates a list of Strings for the Line
	*/
	private List<String> getRecordFromLine(String line)
	{
		List<String> values = new ArrayList<String>();
		try(Scanner rowScanner = new Scanner(line))
		{
			rowScanner.useDelimiter(",");
			while(rowScanner.hasNext())
			{
				values.add(rowScanner.next());
			}
		}
		return values;
	}
	/*
	Writes results to a file results.txt
	Little error handleing here but will catch
	*/
	public boolean writeResults(String text)
	{
		try
		{
			FileWriter writeFile = new FileWriter("results.txt");
			writeFile.write(text);
			writeFile.close();
			return true;
		}
		catch(Exception w)
		{
			return false;
		}
	}
	/*
	Returns a String firstname from a line in records
	*/
	public String getFNameUtility(int line)
	{
		String name = records.get(line).get(4);
		return name.substring(0, name.indexOf(" "));
	}
	/*
	Returns a String lastname from a line in records
	*/
	public String getLNameUtility(int line)
	{
		String name = records.get(line).get(4);
		return name.substring(name.indexOf(" ") + 1);
	}
	/*
	Returns a String UIN from a line in records
	*/
	public String getUINUtility(int line)
	{
		String email = records.get(line).get(6);
		return email.substring(0, email.indexOf("@"));
	}
	/*
	Returns a Rank ENUM from a line in records
	*/
	public Rank getRankUtility(int line)
	{
		String stringRank = "";

		switch(Integer.parseInt(records.get(line).get(7))) // using a switch because int to ENUM was not working
		{ // more memory intensive but Java will handle cleanup when this method ends
		case 1:
			stringRank = "FRESHMAN";
			break;
		case 2:
			stringRank = "SOPHMORE";
			break;
		case 3:
			stringRank = "JUNIOR";
			break;
		case 4:
			stringRank = "SENIOR";
			break;
		}
		Rank tempRank = Rank.valueOf(stringRank);
		return tempRank;
	}
	/*
	Returns an int JavaKnowlege from a line in records
	*/
	public int getJavaKnowlegeUtility(int line)
	{
		return Integer.parseInt(records.get(line).get(1));
	}
	/*
	Returns an int section from a line in records
	*/
	public int getSectionUtility(int line)
	{
		return Integer.parseInt(records.get(line).get(5).substring(0, records.get(line).get(5).indexOf(" ")));
	}
	/*
	Returns the length of List records
	*/
	public int length()
	{
		return records.size(); // may still be used in Teambuilder.
	}
}