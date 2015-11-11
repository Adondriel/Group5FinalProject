package attacks;

import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.Charizard;
import pokemon.Charmander;
import pokemon.Pokemon;

/**
 * @author Bradley Solorzano
 * Group 5 Final Project
 * tes firebased attaks
 *
 */
public class testFireAttacks
{

	/**
	 * test that a fire attack is of fire type
	 */
	@Test
	public void testInitializition()
	{
		/*Pokemon charmander = new Charmander();
		Pokemon charizard = new Charizard(); */
		
		TypeBehavior fire = new FireType();
		Attack fireSaber = new FireAttack(fire, 50);
		assertEquals(fire, fireSaber.getAttackType());
		assertEquals(50, fireSaber.getDamage());
		
	}

}
