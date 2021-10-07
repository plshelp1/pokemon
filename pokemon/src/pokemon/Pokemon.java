package pokemon;

public class Pokemon {
private int health;
private String name;
private String moves;
private int damage;

public Pokemon(int h, String n, String m, int d) {

health = h;
name = n;
moves = m;
damage = d;
			
			}

public int getHealth()
	{
		return health;
	}

public void setHealth(int health)
	{
		this.health = health;
	}

public String getName()
	{
		return name;
	}

public void setName(String name)
	{
		this.name = name;
	}

public String getMoves()
	{
		return moves;
	}

public void setMoves(String moves)
	{
		this.moves = moves;
	}

public int getDamage()
	{
		return damage;
	}

public void setDamage(int damage)
	{
		this.damage = damage;
	}
}

	


