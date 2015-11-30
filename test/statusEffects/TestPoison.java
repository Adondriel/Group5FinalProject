package statusEffects;
/**
 * Tests the functionality of the Poison class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.StatusEffectException;
import pokemon.*;

public class TestPoison 
{
	
	/**
	 * Checks to see that poison is initialized correctly.
	 * @throws StatusEffectException 
	 */
	@Test
	public void testInitialization() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect poison = new Poison(blastoise);
		
		//checks that the number of the status effects was updated. 
		assertEquals(1, poison.getNumStatusEffects());
	}
	
	/**
	 * Checks to see that only 1 poison or status effect can be applied at a time.
	 * @throws StatusEffectException 
	 */
	@Test(expected = StatusEffectException.class)
	public void testOnlyOneStatusEffect() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect poison1 = new Poison(blastoise);
		assertEquals(1, poison1.getNumStatusEffects());
		StatusEffect poison2 = new Poison(poison1);
		assertEquals("Only 1 status effect can be applied at a time." , poison2.getNumStatusEffects());	
	}
	
	/**
	 * Checks to see that poison does the correct damage.
	 * @throws StatusEffectException 
	 */
	@Test
	public void testCorrectDamage() throws StatusEffectException 
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect poison = new Poison(blastoise);
		assertEquals(25, poison.statusTick());
	}
		
	/**
	 * Checks to see that poison will only last for 3 turns.
	 * @throws StatusEffectException 
	 */
	@Test
	public void testThreeTurns() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect poison = new Poison(blastoise);
		
		//tick on the first turn
		assertEquals(25, poison.statusTick());
		
		//tick on the second turn
		assertEquals(25, poison.statusTick());
		
		//tick on the third turn
		assertEquals(25, poison.statusTick());
		
		//tick on the fourth turn
		assertEquals(0, poison.statusTick());
	}
}