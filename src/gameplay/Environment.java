package gameplay;
import gameState.TurnChange;

import java.util.ArrayList;



import pokemon.*;

/**
 * @author Jason LoBianco
 *
 */
public class Environment 
{
	private Player player;
	private Computer computer;
	private static Environment battleField = null;
	private ArrayList<Pokemon> computerPokedex = new ArrayList<Pokemon>();
	private TurnChange tc;
	
	/**
	 * Creates a battleField for the Player's and Computer's Pokemon to do battle.
	 * @param p The player to be in the battleField.
	 * @param c The computer to be in the battleField.
	 */
	private Environment()
	{
		player = new Player(null, null);
		String [] pokemon = {"Blastoise", "Bulbasaur", "Caterpie", "Charizard", "Charmander", "Charmeleon", "Ivysaur", "Poliwag", "Squirtle", "Venusaur", "Vulpix", "Wartortle"};
		int pokemon1 = (int) (Math.floor(Math.random()*12));
		String pokemon1String = pokemon[pokemon1];
		int pokemon2 = (int) (Math.floor(Math.random()*12));
		String pokemon2String = pokemon[pokemon2];
		int pokemon3 = (int) (Math.floor(Math.random()*12));
		String pokemon3String = pokemon[pokemon3];
		if (pokemon1String == "Blastoise")
		{
			Pokemon blastoise = new Blastoise();
			computerPokedex.add(blastoise);
		}
		else if (pokemon1String == "Bulbasaur")
		{
			Pokemon bulbasaur = new Bulbasaur();
			computerPokedex.add(bulbasaur);
		}
		else if (pokemon1String == "Caterpie")
		{
			Pokemon caterpie = new Caterpie();
			computerPokedex.add(caterpie);
		}
		else if (pokemon1String == "Charizard")
		{
			Pokemon charizard = new Charizard();
			computerPokedex.add(charizard);
		}
		else if (pokemon1String == "Charmander")
		{
			Pokemon charmander = new Charmander();
			computerPokedex.add(charmander);
		}
		else if (pokemon1String == "Charmeleon")
		{
			Pokemon charmeleon = new Charmeleon();
			computerPokedex.add(charmeleon);
		}
		else if (pokemon1String == "Ivysaur")
		{
			Pokemon ivysaur = new Ivysaur();
			computerPokedex.add(ivysaur);
		}
		else if (pokemon1String == "Poliwag")
		{
			Pokemon poliwag = new Poliwag();
			computerPokedex.add(poliwag);
		}
		else if (pokemon1String == "Squirtle")
		{
			Pokemon squirtle = new Squirtle();
			computerPokedex.add(squirtle);
		}
		else if (pokemon1String == "Venusaur")
		{
			Pokemon venusaur = new Venusaur();
			computerPokedex.add(venusaur);
		}
		else if (pokemon1String == "Vulpix")
		{
			Pokemon vulpix = new Vulpix();
			computerPokedex.add(vulpix);
		}
		else if (pokemon1String == "Wartortle")
		{
			Pokemon wartortle = new Wartortle();
			computerPokedex.add(wartortle);
		}
		if (pokemon2String == "Blastoise")
		{
			Pokemon blastoise = new Blastoise();
			computerPokedex.add(blastoise);
		}
		else if (pokemon2String == "Bulbasaur")
		{
			Pokemon bulbasaur = new Bulbasaur();
			computerPokedex.add(bulbasaur);
		}
		else if (pokemon2String == "Caterpie")
		{
			Pokemon caterpie = new Caterpie();
			computerPokedex.add(caterpie);
		}
		else if (pokemon2String == "Charizard")
		{
			Pokemon charizard = new Charizard();
			computerPokedex.add(charizard);
		}
		else if (pokemon2String == "Charmander")
		{
			Pokemon charmander = new Charmander();
			computerPokedex.add(charmander);
		}
		else if (pokemon2String == "Charmeleon")
		{
			Pokemon charmeleon = new Charmeleon();
			computerPokedex.add(charmeleon);
		}
		else if (pokemon2String == "Ivysaur")
		{
			Pokemon ivysaur = new Ivysaur();
			computerPokedex.add(ivysaur);
		}
		else if (pokemon2String == "Poliwag")
		{
			Pokemon poliwag = new Poliwag();
			computerPokedex.add(poliwag);
		}
		else if (pokemon2String == "Squirtle")
		{
			Pokemon squirtle = new Squirtle();
			computerPokedex.add(squirtle);
		}
		else if (pokemon2String == "Venusaur")
		{
			Pokemon venusaur = new Venusaur();
			computerPokedex.add(venusaur);
		}
		else if (pokemon2String == "Vulpix")
		{
			Pokemon vulpix = new Vulpix();
			computerPokedex.add(vulpix);
		}
		else if (pokemon2String == "Wartortle")
		{
			Pokemon wartortle = new Wartortle();
			computerPokedex.add(wartortle);
		}
		if (pokemon3String == "Blastoise")
		{
			Pokemon blastoise = new Blastoise();
			computerPokedex.add(blastoise);
		}
		else if (pokemon3String == "Bulbasaur")
		{
			Pokemon bulbasaur = new Bulbasaur();
			computerPokedex.add(bulbasaur);
		}
		else if (pokemon3String == "Caterpie")
		{
			Pokemon caterpie = new Caterpie();
			computerPokedex.add(caterpie);
		}
		else if (pokemon3String == "Charizard")
		{
			Pokemon charizard = new Charizard();
			computerPokedex.add(charizard);
		}
		else if (pokemon3String == "Charmander")
		{
			Pokemon charmander = new Charmander();
			computerPokedex.add(charmander);
		}
		else if (pokemon3String == "Charmeleon")
		{
			Pokemon charmeleon = new Charmeleon();
			computerPokedex.add(charmeleon);
		}
		else if (pokemon3String == "Ivysaur")
		{
			Pokemon ivysaur = new Ivysaur();
			computerPokedex.add(ivysaur);
		}
		else if (pokemon3String == "Poliwag")
		{
			Pokemon poliwag = new Poliwag();
			computerPokedex.add(poliwag);
		}
		else if (pokemon3String == "Squirtle")
		{
			Pokemon squirtle = new Squirtle();
			computerPokedex.add(squirtle);
		}
		else if (pokemon3String == "Venusaur")
		{
			Pokemon venusaur = new Venusaur();
			computerPokedex.add(venusaur);
		}
		else if (pokemon3String == "Vulpix")
		{
			Pokemon vulpix = new Vulpix();
			computerPokedex.add(vulpix);
		}
		else if (pokemon3String == "Wartortle")
		{
			Pokemon wartortle = new Wartortle();
			computerPokedex.add(wartortle);
		}
		computer = new Computer(computerPokedex, null);
		computer.setSelectedPokemon(computer.getPokemon((int) (Math.random()*3)));
		
		//playerCurrentPokemon = player.getSelectedPokemon();
		//computerCurrentPokemon = computer.getSelectedPokemon();
		battleField = this;
		
		
	}
	
	/**
	 * Will create OR return the Environment for the Pokemon. 
	 * @return the battleField for the Pokemon to battle in.
	 */
	public static Environment getEnvironment()
	{
		if (battleField == null)
		{
			synchronized (Environment.class)
			{
				if (battleField == null)
				{
					battleField = new Environment();
				}
			}
		}
		return battleField;	
	}	
	/**
	 * @param p The player
	 */
	public void setPlayer(Player p)
	{
		player = p;
	}
	
	/**
	 * @param c The computer
	 */
	public void setComputer(Computer c)
	{
		computer = c;
	}	
	/**
	 * @return The Player
	 */
	public Trainer getPlayer()
	{
		return player;
	}
	
	/**
	 * @return The Computer
	 */
	public Trainer getComputer()
	{
		return computer;
	}

	/**
	 * @return turn changed
	 */
	public TurnChange getTc() {
		return tc;
	}

	public void setTC(TurnChange turnChange) {
		tc = turnChange;
	}
}