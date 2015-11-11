package attacks;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Bradley Solorzano
 * Group 5 Final project
 *
 */
public class testWaterAttacks
{

	/**
	 * test that a water attack is water type
	 */
	@Test
	public void testInitializition()
	{
		
		TypeBehavior water = new WaterType();
		Attack bubbleBlaster = new FireAttack(water, 50);
		assertEquals(water, bubbleBlaster.getAttackType());
		assertEquals(50, bubbleBlaster.getDamage());
		
	}

}
