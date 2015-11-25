package statusEffects;
/**
 * Tests the functionality of the Burn class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.StatusEffectException;
import pokemon.*;

public class TestBurn 
{
	/**
	 * Checks to see that burn is initialized correctly.
	 * @throws StatusEffectException 
	 */
	@Test
	public void testInitialization() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect burn = new Burn(blastoise);
		
		//checks that the number of the status effects was updated. 
		assertEquals(1, burn.getNumStatusEffects());
	}
	
	/**
	 * Checks to see that only 1 burn or status effect can be applied at a time.
	 * @throws StatusEffectException 
	 */
	@Test(expected = StatusEffectException.class)
	public void testOnlyOneStatusEffect() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect burn1 = new Burn(blastoise);
		assertEquals(1, burn1.getNumStatusEffects());
		StatusEffect burn2 = new Burn(burn1);
		assertEquals("Only 1 status effect can be applied at a time." , burn2.getNumStatusEffects());
		
	}
	
	/**
	 * Checks to see that burn does the correct damage.
	 * @throws StatusEffectException 
	 */
	@Test
	public void testCorrectDamage() throws StatusEffectException 
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect burn = new Burn(blastoise);
		assertEquals(10, burn.statusTick());
	}
		
	/**
	 * Checks to see that burn will only last for 3 turns.
	 * @throws StatusEffectException 
	 */
	@Test
	public void testThreeTurns() throws StatusEffectException
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect burn = new Burn(blastoise);
		
		//tick on the first turn
		assertEquals(10, burn.statusTick());
		
		//tick on the second turn
		assertEquals(10, burn.statusTick());
		
		//tick on the third turn
		assertEquals(10, burn.statusTick());
		
		//tick on the fourth turn
		assertEquals(0, burn.statusTick());
	}
}