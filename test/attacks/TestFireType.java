package attacks;
/**
 * Tests the functionality of the FireType class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.*;

public class TestFireType 
{

	/**
	 * Checks to see that a fire attack does the correct damage against a fire type.
	 */
	@Test
	public void testFireVsFire() 
	{
		Pokemon charizard = new Charizard();
		Pokemon vulpix = new Vulpix();
		int result = charizard.getType().calcDamage(charizard.getDamage(), vulpix.getType());
		assertEquals(84, result);
	}
	
	/**
	 * Checks to see that a fire attack does the correct damage against a water type.
	 */
	@Test
	public void testFireVsWater()
	{
		Pokemon charizard = new Charizard();
		Pokemon squirtle = new Squirtle();
		int result = charizard.getType().calcDamage(charizard.getDamage(), squirtle.getType());
		assertEquals(42, result);
	}
	
	/**
	 * Checks to see that a fire attack does the correct damage against a grass type.
	 */
	@Test
	public void testFireVsGrass()
	{
		Pokemon charizard = new Charizard();
		Pokemon ivysaur = new Ivysaur();
		int result = charizard.getType().calcDamage(charizard.getDamage(), ivysaur.getType());
		assertEquals(168, result);
	}
}