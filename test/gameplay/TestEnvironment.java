package gameplay;
/**
 * Tests the functionality of the Environment class.
 * Author: Jason LoBianco
 */
import static org.junit.Assert.*;

import java.util.ArrayList;

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
	private ArrayList<Pokemon> playerPokedex = new ArrayList<Pokemon>();
	private ArrayList<Pokemon> computerPokedex = new ArrayList<Pokemon>();
	
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
		playerPokedex.add(blastoise);
		playerPokedex.add(caterpie);
		playerPokedex.add(vulpix);
		computerPokedex.add(bulbasaur);
		computerPokedex.add(charmander);
		computerPokedex.add(ivysaur);
		p = new Player(playerPokedex, blastoise);
		c = new Computer(computerPokedex, bulbasaur);
		battlefield = Environment.getEnvironment(p, c);
	}

	/**
	 * Checks to see that the player and computer Pokemon got set into the correct spots.
	 */
	@Test
	public void testInitialization() 
	{
		
		assertTrue(battlefield.getCurrentPlayerPokemon() instanceof Blastoise);
		assertTrue(battlefield.getCurrentComputerPokemon() instanceof Bulbasaur);
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
	
	/**
	 * Checks to see that a player can switch their current Pokemon on the battlefield.
	 */
	@Test
	public void testPlayerSwitchPokemon()
	{
		
	}
	
	/**
	 * Checks to see that a computer can switch their current Pokemon on the battlefield.
	 */
	@Test
	public void testComputerSwitchPokemon()
	{
		
	}
}