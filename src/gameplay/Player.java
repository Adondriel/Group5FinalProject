package gameplay;

import pokemon.Bulbasaur;
import pokemon.Pokemon;

public class Player 
{
	Pokemon[] pokedex = new Pokemon[3]; //Holds the Pokemon.
	Pokemon selectedPokemon;

	//Jason had to add this method to remove an error from code.
	/**
	 * @param i the position in the pokedex.
	 * @return The selected Pokemon from the pokedex.
	 */
	public Player(Pokemon[] pokeList, Pokemon selectedPokemon){
		pokedex = pokeList;
		this.selectedPokemon = selectedPokemon;
	}
	
	public Pokemon getPokemon(int i) 
	{
		return pokedex[i];
	}

	public void setSelectedPokemon(Pokemon pokemon) {
		selectedPokemon = pokemon;
	}
	
	public void setPokedex(Pokemon[] pokeList){
		
	}

	public Pokemon getSelectedPokemon() {
		// TODO Auto-generated method stub
		return selectedPokemon;
	}

}
