package statusEffects;
/**
 * Tests the functionality of the Frozen class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.*;

public class TestFrozen 
{

	/**
	 * Checks that a Pokemon misses an attack when frozen.
	 * Note: 80% change of a Pokemon missing an attack when frozen.
	 * (In this test, that value will be forced.)
	 */
	@Test
	public void testIsFrozen() 
	{
		Pokemon blastoise = new Blastoise();
		Pokemon vulpix = new Vulpix();
		StatusEffect frozen = new Frozen(blastoise);
		frozen.statusTick();
		frozen.setChanceToAttack(1);  //value manually set just so test always passes, but value is random.
		boolean result = blastoise.attack(vulpix);
		assertFalse(result);
		assertEquals(38,vulpix.getCurrentHealth());
	}
	
	/**
	 * Checks that a Pokemon gets to attack when frozen.
	 * Note: 20% change of a Pokemon getting to attack when frozen
	 * (In this test, that value will be forced.)
	 */
	@Test
	public void testNotFrozen()
	{
		Pokemon blastoise = new Blastoise();
		Pokemon vulpix = new Vulpix();
		StatusEffect frozen = new Frozen(blastoise);
		frozen.statusTick();
		frozen.setChanceToAttack(0);  //value manually set just so test always passes, but value is random.
		boolean result = blastoise.attack(vulpix);
		assertTrue(result);
		assertEquals(0,vulpix.getCurrentHealth());
	}
	
	/**
	 * Checks that a Pokemon will only be frozen for three turns.
	 * Note: Values are set for the first three statusTick's to predict the outcome.
	 * The last status tick will set the Pokemon's chanceToAttack back to 1.
	 */
	@Test
	public void testOnlyLastsThreeRounds()
	{
		Pokemon blastoise = new Blastoise();
		Pokemon vulpix = new Vulpix();
		StatusEffect frozen = new Frozen(vulpix);
		frozen.statusTick(); //first tick
		frozen.setChanceToAttack(1);
		boolean result = vulpix.attack(blastoise);
		assertFalse(result);
		assertEquals(79, blastoise.getCurrentHealth());
		frozen.statusTick(); //second tick
		frozen.setChanceToAttack(0);
		boolean result2 = vulpix.attack(blastoise);
		assertTrue(result2);
		assertEquals(38, blastoise.getCurrentHealth());
		frozen.statusTick(); //third tick
		frozen.setChanceToAttack(1);
		boolean result3 = vulpix.attack(blastoise);
		assertFalse(result3);
		assertEquals(38, blastoise.getCurrentHealth());
		frozen.statusTick(); //fourth tick
		boolean result4 = vulpix.attack(blastoise);
		assertTrue(result4);
		assertEquals(0, blastoise.getCurrentHealth());
	}
}
