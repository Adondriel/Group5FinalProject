package gameplay;

import java.util.ArrayList;

import pokemon.Pokemon;

public class Computer extends Trainer 
{
	ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();	//Holds the Pokemon.
	Pokemon selectedPokemon;
	
	/**
	 * @param pokeList
	 * @param selectedPokemon
	 */
	public Computer(ArrayList<Pokemon> pokeList, Pokemon selectedPokemon){
		pokedex=pokeList;
		this.selectedPokemon=selectedPokemon;
	}
	
	/**
	 * @param pokemon
	 * set the current pokemon
	 */
	public void setSelectedPokemon(Pokemon pokemon) {
		selectedPokemon = pokemon;
	}
	
	/**
	 * @return the currently selected pokemon
	 */
	public Pokemon getSelectedPokemon() {
		return selectedPokemon;
	}
}