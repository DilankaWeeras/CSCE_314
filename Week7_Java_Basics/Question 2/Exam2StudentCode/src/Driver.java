import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		// %%%%%%%%%%%%%%%%%%%% QUESTION 2 %%%%%%%%%%%%%%%%%%%%%%%
		
		int curve = -1;
		float grade = (float) -0.0;
		// Create the Scanner code to gather a float and an integer using the variables already created
		final Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the grade you received: ");
		grade = sc.nextFloat();
		// code here
		System.out.println("Please enter the curve percentage you will receive: (example 5%) ");
		// code here
		curve = sc.nextInt();
		
		
		// just for a hint for the integer (Integer) portion, try below:
		// https://docs.oracle.com/javase/8/docs/api/?java/lang/Integer.html
		

		System.out.println("Here are the values collected");
		// Display both values collected using a System.out.println
		System.out.println(grade);
		System.out.println(curve);
		
		
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 2 %%%%%%%%%%%%%%%%%%%%%%%
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 3 %%%%%%%%%%%%%%%%%%%%%%%
		
		// Using the variables and the new values received (curve and grade), call the curvedGrade  
		// (first one) function from here and display the results the function returns here
		// 1. fix the curvedGrade function below. Remember, if you get a 90, with 10% curve, you now have a 99%
		// 2. call function
		// 3. display result
		System.out.println("This is your new grade: ");
		float newGrade = curvedGrade(grade, curve);
		System.out.println(newGrade);
		



					
		// %%%%%%%%%%%%%%%%%%%% QUESTION 3 %%%%%%%%%%%%%%%%%%%%%%%
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 4 %%%%%%%%%%%%%%%%%%%%%%%
		
		// Create instance of a Student here
		Student s1 = new Student("Dilanka", "Weerasinghe", grade);
		// call and pass STUDENT and a curved value to curvedGrade (second one) function
		curvedGrade(s1, curve);
		// display the new results ONLY using the "get" Student class functions
		System.out.println("Grade of Student = " + s1.getscore());
		// display the new results ONLY using the "toString" Student class functions
		System.out.println(s1.toString());
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 4 %%%%%%%%%%%%%%%%%%%%%%%
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 5 %%%%%%%%%%%%%%%%%%%%%%%
	
		int value1 = 23;
		float value2 = (float) 23.5;
		String value3 = "Lupoli";
		int [] value4 = {2,3,4,5};

		passingExercise(value1, value2, value3, value4);

		// using the values directly above, call the passingExercise function
		// notice the displays below. Which values were changed by the function??

		/*
		ANSWER:!!!!!!
		Nothing is going to happen because Java is pass by value.
		In the output everything is going to be the same.

		What are Java;s primitive types?
		- Float, int, boolean, char. byte, short, longm double

		Are Java’s primitive types pass by value or reference?
		- value

		Are Java’s String types pass by value or reference?
		- value

		Are Java’s Array types pass by value or reference?
		- value

		*/
		
		System.out.println("Here is the resulting value for value1->" + value1);
		System.out.println("Here is the resulting value for value2->" + value2);
		System.out.println("Here is the resulting value for value3->" + value3);
		System.out.println("Here is the resulting value for value4->" + value4);
		
		
		// %%%%%%%%%%%%%%%%%%%% QUESTION 5 %%%%%%%%%%%%%%%%%%%%%%%
		
		
		System.out.println("Program complete.");
	}
	
	public static float curvedGrade(float thisGrade, int percentCurve)
	{
		float result = 0; // default value
		
		// create the code to get this function to truely work
		result = thisGrade + (percentCurve * thisGrade)/100;
		
		return result;
	}

	public static void curvedGrade(Student thisStudent, int percentCurve)
	{
		// reset value WITHIN the Student instance to new curved grade!!
		thisStudent.setscore(thisStudent.getscore() + (thisStudent.getscore() *percentCurve) / 100);
	}
	
	public static void passingExercise(int x, float y, String z, int [] array)
	{
		x = x * 10;
		y = y * 10;
		z += 'Z';
		array[0] = -23;
	}
}

