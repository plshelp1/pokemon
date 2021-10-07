package pokemon;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Pokerun
	{
		static Pokemon char1 = Types.pokemon.get(1);
		static Pokemon char2 = Types.pokemon.get(0);
		public static void main(String[] args)
			{		
				Types.fillArray();
				begin();
				bash();
			}
			public static void begin(){			
				Scanner userInput = new Scanner(System.in);
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("Welcome to the arena!");
		    	System.out.println();
		    	System.out.println("What pokemon would you like to play as?");
				for (int i = 0; i < 3; i++) {
				System.out.println((i+1) + ". " + Types.pokemon.get(i).getName());
			}
				String name = userStringInput.nextLine();
				if (name.equals("gengar"))
					{
						System.out.println("You picked " + Types.pokemon.get(0).getName() + " (HEALTH " +Types.pokemon.get(0).getHealth() + " MOVES and DAMAGE " + Types.pokemon.get(0).getMoves() + ")");
					} else if (name.equals("charizard")) {
						System.out.println("You picked " + Types.pokemon.get(1).getName()+ " (HEALTH " +Types.pokemon.get(1).getHealth() + " MOVES and DAMAGE " + Types.pokemon.get(1).getMoves() + ")");
					} else if (name.equals ("mewtwo")) {
						System.out.println("You picked " + Types.pokemon.get(2).getName()+ " (HEALTH " +Types.pokemon.get(2).getHealth() + " MOVES and DAMAGE " + Types.pokemon.get(2).getMoves() + ")");
					}
				System.out.println("Now who would you like to battle?");
				String ene = userStringInput.nextLine();
				if (ene.equals("gengar"))
					{
						System.out.println("You will fight " + Types.pokemon.get(0).getName() + " (HEALTH " +Types.pokemon.get(0).getHealth() + " MOVES and DAMAGE " + Types.pokemon.get(0).getMoves() + ")");
					} else if (ene.equals("charizard")) {
						System.out.println("You will fight " + Types.pokemon.get(1).getName()+ " (HEALTH " +Types.pokemon.get(1).getHealth() + " MOVES and DAMAGE " + Types.pokemon.get(1).getMoves() + ")");
					} else if (ene.equals ("mewtwo")) {
						System.out.println("You will fight " + Types.pokemon.get(2).getName()+ " (HEALTH " +Types.pokemon.get(2).getHealth() + " MOVES and DAMAGE " + Types.pokemon.get(2).getMoves() + ")");
					}
				System.out.println("Let the battle Begin! " + "(" + name + " vs " + ene + ")");
			}
	
public static void bash() {
	
	while (char1.getHealth()>0 && char2.getHealth()>0) {
		char1.setHealth (char1.getHealth()- char2.getDamage());
	}

	
}
	}