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
		battlefield = Environment.getEnvironment();
	}

	/**
	 * Checks to see that the player and computer Pokemon got set into the correct spots.
	 */
	@Test
	public void testInitialization() 
	{
		battlefield.setPlayerPokemon(p.getPokemon(0));
		battlefield.setComputerPokemon(c.getPokemon(0));
		assertTrue(battlefield.getCurrentPlayerPokemon() instanceof Blastoise);
		assertTrue(battlefield.getCurrentComputerPokemon() instanceof Bulbasaur);
	}
	
	/**
	 * Checks to see that a player can switch their current Pokemon on the battlefield.
	 */
	@Test
	public void testPlayerSwitchPokemon()
	{
		battlefield.setPlayerPokemon(p.getPokemon(0));
		assertTrue(battlefield.getCurrentPlayerPokemon() instanceof Blastoise);
		battlefield.setPlayerPokemon(p.getPokemon(1));
		assertTrue(battlefield.getCurrentPlayerPokemon() instanceof Caterpie);
	}
	
	/**
	 * Checks to see that a computer can switch their current Pokemon on the battlefield.
	 */
	@Test
	public void testComputerSwitchPokemon()
	{
		battlefield.setComputerPokemon(c.getPokemon(0));
		assertTrue(battlefield.getCurrentComputerPokemon() instanceof Bulbasaur);
		battlefield.setComputerPokemon(c.getPokemon(1));
		assertTrue(battlefield.getCurrentComputerPokemon() instanceof Charmander);
	}
}