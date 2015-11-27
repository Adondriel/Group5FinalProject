package attacks;
/**
 * Tests the functionality of the GrassType class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.*;

public class TestGrassType 
{

	/**
	 * Checks to see that a grass attack does the correct damage against a grass type.
	 */
	@Test
	public void testGrassVsGrass() 
	{
		Pokemon bulbasaur = new Bulbasaur();
		Pokemon caterpie = new Caterpie();
		int result = bulbasaur.getType().calcDamage(bulbasaur.getDamage(), caterpie.getType());
		assertEquals(49, result);
	}
	
	/**
	 * Checks to see that a grass attack does the correct damage against a water type.
	 */
	@Test
	public void testGrassVsWater()
	{
		Pokemon bulbasaur = new Bulbasaur();
		Pokemon squirtle = new Squirtle();
		int result = bulbasaur.getType().calcDamage(bulbasaur.getDamage(), squirtle.getType());
		assertEquals(98, result);
	}
	
	/**
	 * Checks to see that a grass attack does the correct damage against a fire type.
	 */
	@Test
	public void testGrassVsFire()
	{
		Pokemon bulbasaur = new Bulbasaur();
		Pokemon charizard = new Charizard();
		int result = bulbasaur.getType().calcDamage(bulbasaur.getDamage(), charizard.getType());
		assertEquals(24, result);
	}
}