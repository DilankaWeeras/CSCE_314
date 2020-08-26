//1a. includes
import java.util.Scanner;
import java.util.Random;

public class StudentDriver
{

    //1.b setting up the cin >> (Scanner in java)
    // It is a n object so you must initialize it as one
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        //2. cout  << and \n

        System.out.println("Please enter your name\n");

        //3. declaring variables, incrementation and const
        int comparison = 0;
        comparison++;
        String description = "";
        boolean flag = false;
        String name = "";
        final double studentGPA = 4.0; // const is replaced with final in java

        //4. cin >> , string concatenation and displaying variables
        name = sc.nextLine();
        System.out.println("Welcome: " + name + "\n");

        //5. Other scanner methods
        System.out.println("Just look up the methods that you want for the object online.");
        System.out.println("It should be in docs oracle. JAVA API scanner / String etc.");

        //6. Accessing an element in a String
        System.out.println("Enter firstname:\t");
        String firstname = sc.next();
        System.out.println("Enter lastname:\t");
        String lastname = sc.next();
        String account = firstname.toLowerCase().charAt(0) + lastname.toLowerCase();
        System.out.println("Account will be:\t" + account);

        //7. Finding the length of a String
        System.out.println("Enter the first of two words\t");
        String firstWord = sc.next();
        System.out.println("Enter the second of two words\t");
        String secondWord = sc.next();

        System.out.println(firstWord.length() + " is the length of the first word.");
        System.out.println(secondWord.length() + " is the length of the second word.");
        
        String eval_sLength = "These words are of equal length.";
        if(firstWord.length() < secondWord.length())
        {
            eval_sLength = "The second word is longer.";
        }
        else if(firstWord.length() <=secondWord.length())
        {
            eval_sLength = "The second word is longer.";
        }
        System.out.println(eval_sLength);

        //8a. Concatenation
        Random r = new Random();
        int xxx = r.nextInt(899) + 100;
        int yyy = r.nextInt(899) + 100;
        int zzzz = r.nextInt(8999) + 1000;

        String phone_number = "(" +xxx + ")-" + yyy + "-" + zzzz;

        //8b. String contains
        System.out.println("Enter an acceptable email address:\t");
        String email_address = sc.next();

        int start = email_address.indexOf("@");
        
        if (email_address.contains(" "))
        {
            System.out.println("Spaces are not allowed.");
        }
        else if (!email_address.contains("@") || !(email_address.contains(".com") || email_address.contains(".edu")))
        {
            System.out.println("Email address is not acceptable");
        }
        else
        {
            System.out.println("Email address is of acceptable format");
        }
        
        //9. Other built-in String functions
        System.out.println(email_address.replace('i', ' ').trim()); //replaces i with spaces and trim string of extra characters
        String firstNameFormat = firstname.toUpperCase().substring(0,1) + firstname.toLowerCase().substring(1);
        String lastNameFormat = lastname.toUpperCase().substring(0,1) + lastname.toLowerCase().substring(1);

        //10.a String comparasin
        String testOne = "Weerasinghe";
        String testTwo = "Dilanka";

        //10b < >
        if(testOne.compareTo(testTwo) < 0)
        {
            System.out.println("testOne is LESS than testTwo");
        }
        if(testOne.compareTo(testTwo) > 0)
        {
            System.out.println("testOne is GREATER than testTwo");
        }
        if(testOne.equals(testTwo))
        {
            System.out.println("testOne is EQUAL to testTwo");
        }




    }
}