public class Airplane extends Vehicle implements Warplane
{
    private String flightNumber;
    private String company;

    Airplane()
    {
        super();
        flightNumber = "";
        company = "";
    }
    Airplane(float speed, String fnum, String comp)
    {
        super(speed);
        flightNumber = fnum;
        company = comp;
    }
    public String getFlightNumber()
    {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    public String getCompany()
    {
        return company;
    }
    public void setCompany(String company)
    {
        this.company = company;
    }
    @Override
    protected String getMotor() {
        return motor;
    }
    @Override
    protected void setMotor(String motor) {
        this.motor = motor;
    }
    @Override
    public void setCountry(String country) {
        //this.country = country;
    }
    @Override
    public String getCountry() {
        return country;
    }
    @Override
    public void fireWeapon() {
        System.out.println("Missle");
    }
}