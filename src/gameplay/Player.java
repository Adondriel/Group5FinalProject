package gameplay;

import items.ItemBehavior;

import java.util.ArrayList;

import pokemon.Bulbasaur;
import pokemon.Pokemon;

/**
 * @author Benjamin Uleau
 *
 */
public class Player extends Trainer
{
	ArrayList<Pokemon> pokedex=new ArrayList<Pokemon>(); 			//The list of Pokemon
	ArrayList<ItemBehavior> items=new ArrayList<ItemBehavior>();	//The list of items (ItemBehaviors)
	//Pokemon[] pokedex = new Pokemon[3]; //Holds the Pokemon.
	Pokemon selectedPokemon;

	//Jason had to add this method to remove an error from code.
	/**
	 * @param i the position in the pokedex.
	 * @return The selected Pokemon from the pokedex.
	 */
	/*public Player(Pokemon[] pokeList, Pokemon selectedPokemon){
		pokedex = pokeList;
		this.selectedPokemon = selectedPokemon;
	}*/
	
	public Player(ArrayList<Pokemon> pokeList, Pokemon selectedPokemon){
		pokedex=pokeList;
		this.selectedPokemon=selectedPokemon;
	}
	
	public Pokemon getPokemon(int i){
		return pokedex.get(i);
	}

	/**
	 * @param pokemon
	 * set the current pokemon
	 */
	public void setSelectedPokemon(Pokemon pokemon) {
		selectedPokemon = pokemon;
	}
	
	public void setPokedex(ArrayList<Pokemon> pokeList){
		
	}

	/**
	 * @return the currently selected pokemon
	 */
	public Pokemon getSelectedPokemon() {
		return selectedPokemon;
	}
	
	/**
	 * @param index
	 * Use an item at index
	 */
	public void useItem(int index){
		super.getItem(index);
	}

}
