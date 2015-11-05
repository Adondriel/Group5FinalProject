package items;
/**
 * Tests the functionality of a BottleWater.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestBottleWater 
{

	/**
	 * Checks to see that a BottleWater will heal a Pokemon with using the whole BottleWater.
	 */
	@Test
	public void testFullHeal() 
	{
		int maxLife = 23;
		int currentLife = 5;
		BottleWater bw = new BottleWater();
		int result = bw.UseItem(currentLife, maxLife);
		assertEquals(15, result);
	}
	
	/**
	 * Checks to see that a BottleWater will heal a Pokemon to maxLife but not over.
	 */
	@Test
	public void testToFullHealth()
	{
		int maxLife = 23;
		int currentLife = 20;
		BottleWater bw = new BottleWater();
		int result = bw.UseItem(currentLife, maxLife);
		assertEquals(maxLife, result);
	}
	
	/**
	 * Checks to see that a BottleWater will not heal a dead Pokemon.
	 */
	@Test
	public void testDeadPokemon()
	{
		int maxLife = 23;
		int currentLife = 0;
		BottleWater bw = new BottleWater();
		int result = bw.UseItem(currentLife, maxLife);
		assertEquals(currentLife, result);
	}
	
	/**
	 * Checks to see that a BottleWater will not heal a Pokemon that is at maxLife.
	 */
	@Test
	public void testAtMaxLife()
	{
		int maxLife = 23;
		int currentLife = 23;
		BottleWater bw = new BottleWater();
		int result = bw.UseItem(currentLife, maxLife);
		assertEquals(currentLife, result);
	}
}