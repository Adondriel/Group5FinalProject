package statusEffects;

import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.Blastoise;

public class TestPoison {

	@Test
	public void test() 
	{
		Blastoise blastoise = new Blastoise();
		Poison poison = new Poison(blastoise);
		poison.statusTick();
		assertTrue(blastoise.getPoison());
		assertEquals(71, blastoise.getCurrentHealth());
	}
}