public class Driver 
{
    public static void main(String args[])
    {
        Base one = new Base(1);
        Derived two  = new Derived(2, 3);
        Derived three = new Derived(4, 5, 6);

        
        System.out.println(one.getData());
        System.out.println(two.getSubData());
        System.out.println(three.getRepeatData());
    }
}