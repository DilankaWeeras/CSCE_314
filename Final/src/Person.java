public class Person {
    
    private String name;
    private Address location;

    Person()
    {
        name = "";
        location = new Address();
    }
    Person(String name, Address a)
    {
        this.name = name;
        this.location = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getLocation() {
        return location;
    }
    public void setLocation(Address location) {
        this.location = location;
    }
    public int compareTo(Person x)
    {
        return name.compareTo(x.getName());
    }
    @Override
    public String toString() {
        return name + " " + location.toString() + " ";
    }
}