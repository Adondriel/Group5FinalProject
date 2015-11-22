package statusEffects;
/**
 * Tests the functionality of the Burn class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.*;

public class TestBurn 
{
	
	/**
	 * Checks to see that a burn does the correct damage when at MaxHealth.
	 */
	@Test
	public void testBurnAtFull() 
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect burn = new Burn(blastoise);
		burn.addBurnList(blastoise);
		burn.statusTick();
		assertEquals(69, blastoise.getCurrentHealth());
	}
	
	/**
	 * Checks to see that a burn doesn't put a Pokemon below 0 life points.
	 */
	@Test
	public void testBelowZero()
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect burn = new Burn(blastoise);
		burn.addBurnList(blastoise);
		blastoise.takeHit(75);
		assertEquals(4, blastoise.getCurrentHealth());
		burn.statusTick();
		assertEquals(0, blastoise.getCurrentHealth());
	}

	/**
	 * Checks to see that a burn does the correct damage when not at MaxHealth.
	 */
	@Test
	public void testNotAtMaxHealth()
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect burn = new Burn(blastoise);
		burn.addBurnList(blastoise);
		blastoise.takeHit(20);
		assertEquals(59, blastoise.getCurrentHealth());
		burn.statusTick();
		assertEquals(49, blastoise.getCurrentHealth());
	}
	
	/**
	 * Checks to see that a burn lasts for only three rounds.
	 */
	@Test
	public void testLastsThreeRounds()
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect burn = new Burn(blastoise);
		burn.addBurnList(blastoise);
		burn.statusTick(); //first tick
		assertEquals(69, blastoise.getCurrentHealth());
		burn.statusTick(); //second tick
		assertEquals(59, blastoise.getCurrentHealth());
		burn.statusTick(); //third tick
		assertEquals(49, blastoise.getCurrentHealth());
		burn.removeBurnList(blastoise); //gets removed after three turns
		burn.statusTick(); //fourth tick
		assertEquals(49, blastoise.getCurrentHealth());
	}
}
