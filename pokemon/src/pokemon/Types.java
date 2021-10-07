package pokemon;
import java.util.ArrayList;

public class Types
	{
		static ArrayList<Pokemon> pokemon = new ArrayList<Pokemon>( );
		public static void fillArray( )
		{
			pokemon.add(new Pokemon(120, "gengar", "hypnoblast 35" + " life steal", 35));
			pokemon.add(new Pokemon(170, "charizard", "royal blaze 60" + " battle sense", 60));
			pokemon.add(new Pokemon(180, "mewtwo", "psyburn 65" + " regeneration", 65));
		}

	}

