package gameplay;
//import java.util.ArrayList;

/**
 * Provides functionality for the Player and Computer class.
 * Author: Jason LoBianco
 */
import pokemon.Pokemon;

public abstract class Trainer 
{
	//ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
	Pokemon[] pokedex = new Pokemon[3];	//Holds the Pokemon.
	
	/**
	 * Adds a pokemon into a position I in the pokedex.
	 * @param pokemon The pokemon to be added.
	 * @param i The position in the pokedex.
	 */
	public void addPokemon(Pokemon pokemon, int i) 
	{
		pokedex[i] = pokemon;	
	}
	
	//Jason had to add this method to remove an error from code.
	/**
	 * @param i the position in the pokedex.
	 * @return The selected Pokemon from the pokedex.
	 */
	public Pokemon getPokemon(int i) 
	{
		return pokedex[i];
	}
}