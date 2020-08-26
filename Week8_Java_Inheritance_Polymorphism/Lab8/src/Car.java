public class Car extends Vehicle
{
    private String licensePlate;

    Car()
    {
        super();
        licensePlate = "";
    }
    Car(float speed, String plate)
    {
        super(speed);
        licensePlate = plate;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicense(String plate)
    {
        licensePlate = plate;
    }
    @Override
    protected String getMotor() {
        return motor;
    }
    @Override
    protected void setMotor(String motor) {
        this.motor = motor;
    }
}
