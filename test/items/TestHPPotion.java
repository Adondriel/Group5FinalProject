package items;
/**
 * Tests the functionality of an HP Potion.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestHPPotion 
{
	
	/**
	 * Checks to see that an HP Potion will heal a Pokemon with using the whole HPPotion.
	 */
	@Test
	public void testFullHeal() 
	{
		int maxLife = 23;
		int currentLife = 5;
		HPPotion hpp = new HPPotion();
		int result = hpp.UseItem(currentLife, maxLife);
		assertEquals(20, result);
	}
	
	/**
	 * Checks to see that an HP Potion will heal a Pokemon to maxLife but not over.
	 */
	@Test
	public void testToFullHealth()
	{
		int maxLife = 23;
		int currentLife = 20;
		HPPotion hpp = new HPPotion();
		int result = hpp.UseItem(currentLife, maxLife);
		assertEquals(maxLife, result);
	}
	
	/**
	 * Checks to see that an HP Potion will not heal a dead Pokemon.
	 */
	@Test
	public void testDeadPokemon()
	{
		int maxLife = 23;
		int currentLife = 0;
		HPPotion hpp = new HPPotion();
		int result = hpp.UseItem(currentLife, maxLife);
		assertEquals(currentLife, result);
	}
	
	/**
	 * Checks to see that an HP Potion will not heal a Pokemon that is at maxLife.
	 */
	@Test
	public void testAtMaxLife()
	{
		int maxLife = 23;
		int currentLife = 23;
		HPPotion hpp = new HPPotion();
		int result = hpp.UseItem(currentLife, maxLife);
		assertEquals(currentLife, result);
	}
}