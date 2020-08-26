import java.util.ArrayList;

public class GameMechanics {

    public static boolean BattleTester(ArrayList parameters)
    {
        for(int i = 0; i < parameters.size()-1; i++)
        {
                if(parameters.get(i) instanceof Villain)
                {
                    return false;
                }        
        }
        return true;
    }

    public static void basicWinChances(Hero o1, Villain o2)
    {
        System.out.println("Printed Ratio: ");
        System.out.println(o1.getHearts() + " to " + o2.getHearts());
        System.out.println("Winner: ");
        if(o1.getHearts() > o2.getHearts())
        {
            System.out.println(o1.getName());
        }
        else
        {
            System.out.println(o2.getName());
        }
        System.out.println("");
    }
    public static int advancedWinChances(Character o1, Character o2)
    {
        double lifeValue1 = o1.getHearts();
        double lifeValue2 = o2.getHearts();
        if(o1 instanceof Hero)
        {
            lifeValue1 = o1.getHearts() + (1.5 * ((Hero)o1).getArmour() / 100);
        }
        if(o2 instanceof Hero)
        {
            lifeValue2 = o2.getHearts() + (1.5 * ((Hero)o2).getArmour() / 100);
        }
        System.out.println("Printed Ratio "+ o1.getName() + " to " + o2.getName() +": ");
        System.out.println(lifeValue1+ " to " + lifeValue2);
        System.out.println("Winner: ");
        if(lifeValue1 > lifeValue2)
        {
            System.out.println(o1.getName());
            return 1;
        }
        else if(lifeValue2 > lifeValue1)
        {
            System.out.println(o2.getName());
            return -1;
        }
        System.out.println("");
        return 0;
    }

    public static int compareTo(Character o1, Character o2)
    {
        double lifeValue1 = o1.getHearts();
        double lifeValue2 = o2.getHearts();
        if(o1 instanceof Hero)
        {
            lifeValue1 = o1.getHearts() + (1.5 * ((Hero)o1).getArmour() / 100);
        }
        if(o2 instanceof Hero)
        {
            lifeValue2 = o2.getHearts() + (1.5 * ((Hero)o2).getArmour() / 100);
        }
        if(lifeValue1 > lifeValue2)
        {
            return 1;
        }
        else if(lifeValue2 > lifeValue1)
        {
            return -1;
        }
        return 0;
    }

    public static void sortedBattleFieldCharacters(ArrayList<Character> characterList)
    {
        for(int i = 0; i < characterList.size(); i++)
        {
            for(int j = 0; j < characterList.size() - i; j++)
            {
                if(compareTo(characterList.get(i), characterList.get(j)) == 1)
                {
                    Character temp = characterList.get(j);
                    characterList.set(j, characterList.get(i));
                    characterList.set(i, temp);
                }
            }
        }
    }
}