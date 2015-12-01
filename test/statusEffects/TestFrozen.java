package statusEffects;
/**
 * Tests the functionality of the Frozen class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.StatusEffectException;
import pokemon.*;

public class TestFrozen 
{
	
	/**
	 * Checks to see that frozen is initialized correctly.
	 * @throws StatusEffectException 
	 */
	@Test
	public void testInitialization() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect frozen = new Frozen(blastoise);
		
		//checks that the number of the status effects was updated. 
		assertEquals(1, frozen.getNumStatusEffects());
	}
	
	/**
	 * Checks to see that only 1 frozen or status effect can be applied at a time.
	 * @throws StatusEffectException 
	 */
	@Test(expected = StatusEffectException.class)
	public void testOnlyOneStatusEffect() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect frozen1 = new Frozen(blastoise);
		assertEquals(1, frozen1.getNumStatusEffects());
		StatusEffect frozen2 = new Frozen(frozen1);
		assertEquals("Only 1 status effect can be applied at a time." , frozen2.getNumStatusEffects());	
	}
	/**
	 * Checks that a Pokemon misses an attack when frozen.
	 * Note: 80% change of a Pokemon missing an attack when frozen.
	 * (In this test, that value will be forced.)
	 * @throws StatusEffectException 
	 */
	@Test
	public void testIsFrozen() throws StatusEffectException 
	{
		Pokemon blastoise = new Blastoise();
		Pokemon vulpix = new Vulpix();
		StatusEffect frozen = new Frozen(blastoise);
		frozen.statusTick();
		frozen.setChanceToAttack(0);  //value manually set just so test always passes, but value is random.
		boolean result = blastoise.attack(vulpix);
		assertFalse(result);
		assertEquals(380,vulpix.getCurrentHealth());
	}
	
	/**
	 * Checks that a Pokemon gets to attack when frozen.
	 * Note: 20% change of a Pokemon getting to attack when frozen
	 * (In this test, that value will be forced.)
	 * @throws StatusEffectException 
	 */
	@Test
	public void testNotFrozen() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		Pokemon vulpix = new Vulpix();
		StatusEffect frozen = new Frozen(blastoise);
		blastoise.selectAttack(blastoise.getMoves().get(0));
		frozen.statusTick();
		frozen.setChanceToAttack(1);  //value manually set just so test always passes, but value is random.
		boolean result = blastoise.attack(vulpix);
		assertTrue(result);
		assertEquals(214,vulpix.getCurrentHealth());
	}
	
	/**
	 * Checks that a Pokemon will only be frozen for three turns.
	 * Note: Values are set for the first three statusTick's to predict the outcome.
	 * The last status tick will set the Pokemon's chanceToAttack back to 1.
	 * @throws StatusEffectException 
	 */
	@Test
	public void testOnlyLastsThreeRounds() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		Pokemon vulpix = new Vulpix();
		StatusEffect frozen = new Frozen(vulpix);
		vulpix.selectAttack(vulpix.getMoves().get(0));
		
		//first tick
		frozen.statusTick(); 
		frozen.setChanceToAttack(0);
		boolean result = vulpix.attack(blastoise);
		assertFalse(result);
		assertEquals(790, blastoise.getCurrentHealth());
		
		//second tick
		frozen.statusTick(); 	
		frozen.setChanceToAttack(1);
		boolean result2 = vulpix.attack(blastoise);
		assertTrue(result2);
		assertEquals(770, blastoise.getCurrentHealth());
		
		//third tick
		frozen.statusTick(); 
		frozen.setChanceToAttack(0);
		boolean result3 = vulpix.attack(blastoise);
		assertFalse(result3);
		assertEquals(770, blastoise.getCurrentHealth());
		
		//fourth tick
		frozen.statusTick(); 
		boolean result4 = vulpix.attack(blastoise);
		assertTrue(result4);
		assertEquals(750, blastoise.getCurrentHealth());
	}
}
