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
	private Environment(Player p, Computer c)
	{
		player = p;
		computer = c;
		playerCurrentPokemon = player.getSelectedPokemon();
		computerCurrentPokemon = computer.getSelectedPokemon();
	}
	
	/**
	 * Will create OR return the Environment for the Pokemon. 
	 * @return the battleField for the Pokemon to battle in.
	 */
	public static Environment getEnvironment(Player p, Computer c)
	{
		if (battleField == null)
		{
			synchronized (Environment.class)
			{
				if (battleField == null)
				{
					battleField = new Environment(p,c);
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
	public void setPlayerPokemon(Pokemon p, int i)
	{
		playerCurrentPokemon = player.getPokemon(i);
	}
	
	/**
	 * Removes the Player's Pokemon from the battlefield.
	 */
	public void removePlayerPokemon()
	{
		playerCurrentPokemon = null;
	}
	
	/**
	 * Adds the Computer's Pokemon into the battlefield.
	 * @param p The Computer's Pokemon to be added.
	 * @param i The position of the Pokemon in the Computer's Pokedex.
	 */
	public void setComputerPokemon(Pokemon p, int i)
	{
		computerCurrentPokemon = computer.getPokemon(i);
	}
	
	/**
	 * Removes the COmputer's Pokemon from the battlefield.
	 */
	public void removeComputerPokemon()
	{
		computerCurrentPokemon = null;
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
}