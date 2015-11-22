package statusEffects;
/**
 * Tests the functionality of the Poison class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.*;

public class TestPoison 
{
	
	/**
	 * Checks to see that a poison does the correct damage when at MaxHealth.
	 */
	@Test
	public void testPoisonAtFull() 
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect poison = new Poison(blastoise);
		poison.addPoisonList(blastoise);
		poison.statusTick();
		assertEquals(69, blastoise.getCurrentHealth());
	}
	
	/**
	 * Checks to see that a poison doesn't put a Pokemon below 0 life points.
	 */
	@Test
	public void testBelowZero()
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect poison = new Poison(blastoise);
		poison.addPoisonList(blastoise);
		blastoise.takeHit(75);
		assertEquals(4, blastoise.getCurrentHealth());
		poison.statusTick();
		assertEquals(0, blastoise.getCurrentHealth());
	}

	/**
	 * Checks to see that a poison does the correct damage when not at MaxHealth.
	 */
	@Test
	public void testNotAtMaxHealth()
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect poison = new Poison(blastoise);
		poison.addPoisonList(blastoise);
		blastoise.takeHit(20);
		assertEquals(59, blastoise.getCurrentHealth());
		poison.statusTick();
		assertEquals(49, blastoise.getCurrentHealth());
	}
	
	/**
	 * Checks to see that a poison lasts for only three rounds.
	 */
	@Test
	public void testLastsThreeRounds()
	{
		Pokemon blastoise = new Blastoise();
		StatusEffect poison = new Poison(blastoise);
		poison.addPoisonList(blastoise);
		poison.statusTick(); //first tick
		assertEquals(69, blastoise.getCurrentHealth());
		poison.statusTick(); //second tick
		assertEquals(59, blastoise.getCurrentHealth());
		poison.statusTick(); //third tick
		assertEquals(49, blastoise.getCurrentHealth());
		poison.removePoisonList(blastoise); //gets removed after three turns
		poison.statusTick(); //fourth tick
		assertEquals(49, blastoise.getCurrentHealth());
	}
}