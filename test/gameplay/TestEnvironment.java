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
	private Player p;
	private Computer c;
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
		p = new Player(null, blastoise);
		p.addPokemon(blastoise);
		p.addPokemon(caterpie);
		p.addPokemon(vulpix);
		c.addPokemon(bulbasaur);
		c.addPokemon(charmander);
		c.addPokemon(ivysaur);
		battlefield = Environment.getEnvironment(p.getSelectedPokemon(), c.getSelectedPokemon);
	}

	/**
	 * Checks to see that the player and computer Pokemon got set into the correct spots.
	 */
	@Test
	public void testInitialization() 
	{
		
	}
	
	/**
	 * Checks to see that a player cannot have two Pokemon on the battlefield.
	 */
	@Test
	public void testOnlyOnePlayerPokemon()
	{
		
	}
	
	/**
	 * Checks to see that a computer cannot have two Pokemon on the battlefield.
	 */
	@Test
	public void testOnlyOneComputerPokemon()
	{
		
	}
}