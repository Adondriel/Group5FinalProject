package gameplay;
/**
 * Tests the functionality of the Environment class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pokemon.*;

public class TestEnvironment 
{
	
	/**
	 * All variables needed for the tests.
	 */
	private Player p = new Player();
	private Computer c = new Computer();
	private Pokemon blastoise, caterpie, vulpix, bulbasaur, charmander, ivysaur;
	private Environment battlefield;
	
	/**
	 * Sets up the battlefield before each test.
	 */
	@Before
	public void setUp()
	{
		blastoise = new Blastoise();
		caterpie = new Caterpie();
		vulpix = new Vulpix();
		bulbasaur = new Bulbasaur();
		charmander = new Charmander();
		ivysaur = new Ivysaur();
		p.addPokemon(blastoise, 0);
		p.addPokemon(caterpie, 1);
		p.addPokemon(vulpix, 2);
		c.addPokemon(bulbasaur, 0);
		c.addPokemon(charmander, 1);
		c.addPokemon(ivysaur, 2);
		battlefield = Environment.getEnvironment(p, c);
	}

	/**
	 * Checks to see that a battlefield is initialized correctly.
	 */
	@Test
	public void testInitialization() 
	{
		assertEquals(blastoise, p.getPokemon(0));
		assertEquals(caterpie, p.getPokemon(1));
		assertEquals(vulpix, p.getPokemon(2));
		assertEquals(bulbasaur, c.getPokemon(0));
		assertEquals(charmander, c.getPokemon(1));
		assertEquals(ivysaur, c.getPokemon(2));
	}
}