public class Friend extends Person{
    
    String dateOfBirth;

    Friend()
    {
        super();
        dateOfBirth = "";
    }
    Friend(String name, Address a, String d)
    {
        super(name, a);
        dateOfBirth = d;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    @Override
    public String toString() {
        return super.toString() + " " + getDateOfBirth() +  "\n";
    }
    public int compareTo(Friend x) {
        return dateOfBirth.compareTo(x.getDateOfBirth());
    }
}