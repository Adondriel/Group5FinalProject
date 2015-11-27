package attacks;
/**
 * Tests the functionality of the WaterType class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.*;

public class TestWaterType 
{

	/**
	 * Checks to see that a water attack does the correct damage against a water type.
	 */
	@Test
	public void testWaterVsWater() 
	{
		Pokemon blastoise = new Blastoise();
		Pokemon poliwag = new Poliwag();
		int result = blastoise.getType().calcDamage(blastoise.getDamage(), poliwag.getType());
		assertEquals(83, result);
	}

	/**
	 * Checks to see that a water attack does the correct damage against a grass type.
	 */
	@Test
	public void testWaterVsGrass() 
	{
		Pokemon blastoise = new Blastoise();
		Pokemon caterpie = new Caterpie();
		int result = blastoise.getType().calcDamage(blastoise.getDamage(), caterpie.getType());
		assertEquals(41, result);
	}
	
	/**
	 * Checks to see that a water attack does the correct damage against a fire type.
	 */
	@Test
	public void testWaterVsFire() 
	{
		Pokemon blastoise = new Blastoise();
		Pokemon vulpix = new Vulpix();
		int result = blastoise.getType().calcDamage(blastoise.getDamage(), vulpix.getType());
		assertEquals(166, result);
	}
}