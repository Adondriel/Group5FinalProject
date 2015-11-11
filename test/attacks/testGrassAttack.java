package attacks;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Brad
 *
 */
public class testGrassAttack
{

	/**
	 * test that a grass attack is grass type
	 */
	@Test
	public void testInitializition()
	{
	
		TypeBehavior grass = new GrassType();
		Attack weedWacker = new FireAttack(grass, 50);
		assertEquals(grass, weedWacker.getAttackType());
		assertEquals(50, weedWacker.getDamage());
		
	}

}
