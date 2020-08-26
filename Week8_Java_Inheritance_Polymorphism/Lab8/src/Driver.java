public class Driver {

    public static void main(String argc[])
    {
        /*
        Vehicle v = new Vehicle();
        v.setSpeed((float)120.0);
        System.out.println(v.getSpeed());   
        */

        Car c = new Car(80, "MVD0001");
        c.setMotor("Yamaha 5500");
        System.out.println(c.getSpeed());
        System.out.println(c.getLicensePlate());
        System.out.println(c.getMotor());


        Airplane a = new Airplane(500, "HYT00000022", "AA");
        a.setMotor("L3Wagon");
        System.out.println(a.getSpeed());
        System.out.println(a.getFlightNumber());
        System.out.println(a.getCompany());
        System.out.println(a.getMotor());
        System.out.println(a.getCountry());
    }
}