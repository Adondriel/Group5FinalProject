package gameplay;

import pokemon.Pokemon;

public class Computer 
{
	Pokemon[] pokedex = new Pokemon[3];	//Holds the Pokemon.
	
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
