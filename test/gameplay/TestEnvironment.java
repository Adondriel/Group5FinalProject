package gameplay;
/**
 * Tests the functionality of the Environment class.
 */
import static org.junit.Assert.*;

import org.junit.Test;

class MockPokemon
{
	
}

public class TestEnvironment 
{
	
	private Player p = new Player();
	private Computer c = new Computer();
	private Environment battlefield = Environment.getEnvironment(p, c);

	
	@Test
	public void test() 
	{
		//
	}
}