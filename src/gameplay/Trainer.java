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
	Pokemon selectedPokemon;
	
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
		if (items.size()<=2){
		items.add(i);
		}
	}
	
	/**
	 * @param index
	 * remove item at index from the list
	 */
	public boolean removeItem(ItemBehavior ib){
		return items.remove(ib);
	}
	
	/**
	 * @param index
	 * the item at index
	 */
	public boolean getItem(ItemBehavior ib){
		for(ItemBehavior i : items){
			if(ib==i){
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<ItemBehavior> getItems(){
		return items;
	}
	
	/**
	 * @return the current number of items
	 */
	public int getCurrentNumberOfItems(){
		return items.size();
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
	
	/**
	 * @return the index of the current pokemon
	 */
	public int getSelectedPokemonIndex(){
		return pokedex.indexOf(getSelectedPokemon());
	}
	
	/**
	 * @return the index of the next pokemon
	 */
	public int getNextPokemonIndex(){
		return pokedex.indexOf(getSelectedPokemon())+1;
	}
	
	/**
	 * @param pokedex
	 */
	public void setPokedex(ArrayList<Pokemon> pokedex){
		this.pokedex=pokedex;
	}
	
	/**
	 * @return the pokedex
	 */
	public ArrayList<Pokemon> getPokedex(){
		return pokedex;
	}
	
	public ItemBehavior getItemAtIndex(int i) {
		return items.get(i);
	}
}