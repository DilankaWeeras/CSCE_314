public class Driver 
{
    public static void main(String args[])
    {
        Cube basic = new Cube();
        ExtendedCube advanced = new ExtendedCube();

        basic.setSide(6);
        advanced.setSide(10);

        System.out.println(basic);
        System.out.println(advanced);
    }
}