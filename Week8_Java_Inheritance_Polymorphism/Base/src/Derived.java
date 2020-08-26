import java.util.Base64;

public class Derived extends Base
{
    private int subData;
    private int repeatData;

    public int getSubData()
    {
        return subData;
    }

    public int getRepeatData()
    {
        return repeatData;
    }

    public Derived() {super();}

    public Derived (int a, int b)
    {
        super(a);
        subData = b;
    }

    public Derived (int a, int b, int c)
    {
        super(a);
        super.getData();
        repeatData = super.getData();
    }
}