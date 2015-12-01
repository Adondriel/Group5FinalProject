package gameplay;
/**
 * Provides a battleField for a Player and Computer's Pokemon to do battle in.
 * Author: Jason LoBianco
 */
import pokemon.Pokemon;

public class Environment 
{
	private Player player;
	private Computer computer;
	private static Environment battleField;
	private Pokemon playerCurrentPokemon;
	private Pokemon computerCurrentPokemon;
	
	/**
	 * Creates a battleField for the Player's and Computer's Pokemon to do battle.
	 * @param p The player to be in the battleField.
	 * @param c The computer to be in the battleField.
	 */
	private Environment()
	{
		player = new Player(null, null);
		computer = new Computer(null, null);
		//playerCurrentPokemon = player.getSelectedPokemon();
		//computerCurrentPokemon = computer.getSelectedPokemon();
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
	 * Adds the Player's Pokemon into the battlefield.
	 * @param p The Player's Pokemon to be added.
	 * @param i The position of the Pokemon in the Player's Pokedex.
	 */
	public void setPlayerPokemon(Pokemon p)
	{
		playerCurrentPokemon = p;
	}
	
	/**
	 * Adds the Computer's Pokemon into the battlefield.
	 * @param p The Computer's Pokemon to be added.
	 * @param i The position of the Pokemon in the Computer's Pokedex.
	 */
	public void setComputerPokemon(Pokemon p)
	{
		computerCurrentPokemon = p;
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
	 * @return The Player's current Pokemon.
	 */
	public Pokemon getCurrentPlayerPokemon()
	{
		return playerCurrentPokemon;
	}
	
	/**
	 * @return The Computer's current Pokemon.
	 */
	public Pokemon getCurrentComputerPokemon()
	{
		return computerCurrentPokemon;
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
	
	
}