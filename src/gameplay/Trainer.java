package gameplay;
//import java.util.ArrayList;

import items.ItemBehavior;
import java.util.ArrayList;
import pokemon.Pokemon;

/**
 * @author Benjamin Uleau, Jason LoBianco
 *
 */
public abstract class Trainer 
{
	//ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();
	//Pokemon[] pokedex = new Pokemon[3];	//Holds the Pokemon.
	
	ArrayList<Pokemon> pokedex=new ArrayList<Pokemon>(); 			//The list of Pokemon
	ArrayList<ItemBehavior> items=new ArrayList<ItemBehavior>();	//The list of items (ItemBehaviors)
	
	/**
	 * @param p
	 * Add a pokemon to the list
	 */
	public void addPokemon(Pokemon p){
		if(pokedex.size()<3)
			pokedex.add(p);
	}
	
	/**
	 * @param index
	 * remove pokemon at index from the list
	 */
	public void removePokemon(int index){
		pokedex.remove(index);
	}
	
	/**
	 * @param index
	 * @return the pokemon at index
	 */
	public Pokemon getPokemon(int index){
		return pokedex.get(index);
	}
	
	/**
	 * @param i
	 * add an item to the list
	 */
	public void addItem(ItemBehavior i){
		items.add(i);
	}
	
	/**
	 * @param index
	 * remove item at index from the list
	 */
	public void removeItem(int index){
		items.remove(index);
	}
	
	/**
	 * @param index
	 * the item at index
	 */
	public void getItem(int index){
		items.get(index);
	}
	
	/**
	 * @return the current number of items
	 */
	public int getCurrentNumberOfItems(){
		return items.size();
	}
	
	/**
	 * Adds a pokemon into a position I in the pokedex.
	 * @param pokemon The pokemon to be added.
	 * @param i The position in the pokedex.
	 */
	/*
	public void addPokemon(Pokemon pokemon, int i) 
	{
		pokedex[i] = pokemon;	
	}
	*/
	//Jason had to add this method to remove an error from code.
	/**
	 * @param i the position in the pokedex.
	 * @return The selected Pokemon from the pokedex.
	 */
	/*
	public Pokemon getPokemon(int i) 
	{
		return pokedex[i];
	}
	*/
}