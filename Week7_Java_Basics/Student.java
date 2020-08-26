import java.util.Scanner; // 
import java.util.JOptionPane;


public class Student
{
    static Scanner sc = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String Major;
    private double GPA;

    Student()
    {
        fName = "empty";
        lName = "empty";
        Major = "empty";
        GPA = 0.0;
    }
    Student(String newFName, String newLname)
    {
        fName = newFName;
        lName = newLname;
        Major = "empty";
        GPA = 0.0;
    }
    Student(String newFName, String newLname, String newMajor, double newGPA)
    {
        fName = newFName;
        lName = newLname;
        Major = newMajor;
        GPA = newGPA;
    }
    public String getFName() {return fName;}
    public String getLName() {return lName;}
    public String getMajor() {return Major;}
    public String getGPA() {return GPA;}

    public String setFName(String newFName) {fName = newFName;}
    public String setLName(String newLName) {lName = newLName;}
    public String setMajor(String newMajor) {Major = newMajor;}
    public String setGPA(double newGPAs) {GPA = newGPA;}

    public static void resetStudent(Student x)
    {
        x.setFName("empty");
        x.setLName("empty");
        x.setMajor("empty");
        x.setGPA(0.0)
    }
    
    /*
    public Student guiSetStudent()
    {
        setFName(JOptionPane.showInputDialog("Enter first name:\t"));
        setLName(JOptionPane.showInputDialog("Enter last name:\t"));
        setFName(JOptionPane.showInputDialog("Enter Major:\t"));
        setFName(Double.parseDouble(JOptionPane.showInputDialog("Enter GPA:\t")));
        JOptionPane.showMessageDialog(null, null, toString());
        return this;
    }
    */

    public int compareTo(Student x)
    {
        if (this.GPA == x.GPA) {return 0;}
        else if (this.GPA < x.GPA) {return -1;}
        else {return 1;}
    }

    // the twoString function is like an overloaded print for this object
    public String toString()
    {
        return getGPA()+":"+getMajor()+":"+getLName()+":"+getFName();
    }
}