import java.util.*;

public class Driver {
    
    public static void main(String[] argc)
    {
        ArrayList<Friend> friendList = new ArrayList<Friend>();
        Address a1 = new Address("dd", "pp", "xx", "100");
        Friend f1 = new Friend("Dilanka", a1, "02051999");

        friendList.add(f1);
        System.out.println(friendList);
        System.out.println("Exists? \t" + friendList.contains(f1));

        friendList.remove(f1);
        System.out.println(friendList);
        System.out.println("Exists? \t" + friendList.contains(f1));

        friendList.add(new Friend("Bill", a1, "12345600"));
        friendList.add(new Friend("Amy", a1, "04061998"));
        friendList.add(new Friend("Chad", a1, "07272001"));
        friendList.add(new Friend("Gill", a1, "09121990"));
        friendList.add(new Friend("Newer", a1, "12122012"));

        System.out.println(friendList);

        sortDOB(friendList);
        System.out.println(friendList);

        sortName(friendList);
        System.out.println(friendList);

    }

    /*
    This will sort an Arraylist of Friends by DOB
    */
    public static void sortDOB(ArrayList<Friend> x)
    {
        for(int i = 0; i < x.size(); i++)
        {
            for(int j = 0; j < x.size() - i; j++)
            {
                if(Integer.parseInt(x.get(i).getDateOfBirth()) > Integer.parseInt(x.get(j).getDateOfBirth()))
                {
                    Friend temp = x.get(j);
                    x.set(j, x.get(i));
                    x.set(i, temp);
                    System.out.println("Swap:" + x.get(i) + x.get(j));
                }
            }
        }
    }
    /*
    This will sort an Arraylist of friends by Name
    */
    public static void sortName(ArrayList<Friend> x)
    {
        for(int i = 0; i < x.size(); i++)
        {
            for(int j = 0; j < x.size() - i; j++)
            {
                if(x.get(i).getName().compareTo(x.get(j).getName()) == 1)
                {
                    Friend temp = x.get(j);
                    x.set(j, x.get(i));
                    x.set(i, temp);
                    System.out.println("Swap:" + x.get(i) + x.get(j));
                }
            }
        }
    }
}