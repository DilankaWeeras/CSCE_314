import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Block testBlock = new Block("copper", new Location(0, 0, 0), 5);
		System.out.println(testBlock);
		
		// Character textCharacter = new Character
		// good, just checking, but since Character is abstract, can't create an instance
		
		Villain testVillain0 = new Villain("Creeper", new Location(0, 1, 0), false, "axe", 6);
		Villain testVillain1 = new Villain("Dragon", new Location(0, 1, 0), false, "axe", 7);
		Villain testVillain2 = new Villain("Zombie", new Location(0, 1, 0), false, "axe", 8);
		Villain testVillain3 = new Villain("Fly", new Location(0, 1, 0), false, "axe", 2);
		Villain testVillain4 = new Villain("Cow", new Location(0, 1, 0), false, "axe", 1);

		System.out.println(testVillain0);

		
		Hero testHero0 = new Hero("Bowen", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 5, 10) ;
		Hero testHero1 = new Hero("Andy", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 6, 78) ;
		Hero testHero2 = new Hero("Chase", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 2, 9) ;
		Hero testHero3 = new Hero("Claire", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 1, 20) ;
		Hero testHero4 = new Hero("Derrik", new Location(0, 0, 40), Arrays.asList("iron sword", "beef", "flare"), 8, 100) ;

		System.out.println(testHero0);

		
		ArrayList<Character> BattleRoyale = new ArrayList<Character>();
		//BattleRoyale.add(testBlock); //won't work!! (Thankfully)
		BattleRoyale.add(testVillain0);
		BattleRoyale.add(testVillain1);
		BattleRoyale.add(testVillain2);
		BattleRoyale.add(testVillain3);
		BattleRoyale.add(testVillain4);
		BattleRoyale.add(testHero0);
		BattleRoyale.add(testHero1);
		BattleRoyale.add(testHero2);
		BattleRoyale.add(testHero3);
		BattleRoyale.add(testHero4);

		GameMechanics.basicWinChances(testHero0, testVillain0);
		GameMechanics.advancedWinChances(testHero0, testVillain0);

		System.out.println("Printing the mother of all battles");
		System.out.println(BattleRoyale);

		GameMechanics.sortedBattleFieldCharacters(BattleRoyale);
		System.out.println();
		
		System.out.println("Printing the mother of all battles");
		System.out.println(BattleRoyale);



		
	}

}
