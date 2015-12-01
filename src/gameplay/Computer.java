package gameplay;

import java.util.ArrayList;

import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public class Computer extends Trainer 
{	
	/**
	 * @param pokeList
	 * @param selectedPokemon
	 */
	public Computer(ArrayList<Pokemon> pokeList, Pokemon selectedPokemon){
		pokedex=pokeList;
		this.selectedPokemon=selectedPokemon;
	}
}