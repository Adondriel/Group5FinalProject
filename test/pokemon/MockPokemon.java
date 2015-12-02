package pokemon;
/**
 * @author Bradley Solorzano
 * group 5 final project
 *
 */
import attacks.WaterType;

public class MockPokemon extends Pokemon
{
	public MockPokemon()
	{
		super.damage=48;
		super.maxHealth=440;
		super.currentHealth=maxHealth;
		super.experience=0;
		super.name="Punching Bag";
	}
	
}
