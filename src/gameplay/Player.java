package gameplay;

import items.ItemBehavior;
import java.util.ArrayList;
import pokemon.*;

/**
 * @author Benjamin Uleau
 *
 */
public class Player extends Trainer
{
	//ArrayList<Pokemon> pokedex=new ArrayList<Pokemon>(); 			//The list of Pokemon
	ArrayList<ItemBehavior> items=new ArrayList<ItemBehavior>();	//The list of items (ItemBehaviors)
	//Pokemon[] pokedex = new Pokemon[3]; //Holds the Pokemon.

	//Jason had to add this method to remove an error from code.
	/**
	 * @param pokedex  
	 * @param selectedPokemon 
	 * @param i the position in the pokedex.
	 */
	/*public Player(Pokemon[] pokeList, Pokemon selectedPokemon){
		pokedex = pokeList;
		this.selectedPokemon = selectedPokemon;
	}*/
	
	public Player(ArrayList<Pokemon> pokedex, Pokemon selectedPokemon){
		this.pokedex=pokedex;
		this.selectedPokemon=selectedPokemon;
	}
	
	public Pokemon getPokemon(int i){
		return pokedex.get(i);
	}

	/**
	 * @param index
	 * Use an item at index
	 */
	/*public void useItem(int index){
		super.getItem(index);
	}*/

}
