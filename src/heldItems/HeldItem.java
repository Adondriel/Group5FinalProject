package heldItems;

import pokemon.Pokemon;
import attacks.TypeBehavior;

/**
 * @author Benjamin Uleau
 *
 */
public class HeldItem implements Pkmn
{
	Pokemon p;
	
	/**
	 * @param p
	 */
	public HeldItem(Pokemon p){
		this.p=p;
	}
	
	public boolean attack(Pokemon target){
		return false;
	}
	
	public void statusTick(){
		
	}
	
	public int getDamage(){
		return 0;
	}
	
	public int getMaxHealth(){
		return 0;
	}
	
	public int getCurrentHealth(){
		return 0;
	}
	
	public int getExperience(){
		return 0;
	}

	public TypeBehavior getType(){
		return null;
	}
	
	public void takeHit(int damageTaken)
	{
		
	}
	
	public HeldItem getHeldItem(){
		return null;
	}
	
	/**
	 * @return the pokemon holding the item
	 */
	public Pokemon getPokemon(){
		return p;
	}
}
