package statusEffects;

import static org.junit.Assert.*;

import org.junit.Test;
import pokemon.*;

public class TestPoison {

	@Test
	public void test() 
	{
		Pokemon blastoise = new Blastoise();
		blastoise = new Poison(blastoise);
		blastoise.statusTick();
		//int result = blastoise.statusTick();
		//System.out.println(result);
		//result = blastoise.getCurrentHealth() + result;
		//assertTrue(blastoise.getPoison());
		//assertEquals(71, result);
		assertEquals(71, blastoise.getCurrentHealth());
	}
}